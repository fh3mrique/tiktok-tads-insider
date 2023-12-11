package com.api.tadsinsight.repository.template;

import java.util.List;
import java.util.Optional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


public abstract class RepositoryTemplate<T, TIPO_ID> {
	
	@PersistenceContext
    private EntityManager manager;

    public abstract Class<T> getDomainClass();

    public abstract List<T> buscarTodos();

    public abstract Optional<T> buscarPorId(TIPO_ID id);

    public abstract T criarEntidade();

    public Optional<T> buscarPrimeiro() {
        var jpql = "from " + getDomainClass().getName();
        T entity = manager.createQuery(jpql, getDomainClass()).setMaxResults(1)
                .getSingleResult();

        return Optional.ofNullable(entity);
    }

    // Template Method
    public Optional<T> buscarPorCriteria() {
        T entity = criarEntidade(); // Usa o método criado pela subclasse
        // Lógica comum aqui
        return Optional.ofNullable(entity);
    }

}
