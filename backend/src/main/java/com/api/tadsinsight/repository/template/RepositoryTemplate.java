package com.api.tadsinsight.repository.template;

import java.util.List;
import java.util.Optional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


public abstract class RepositoryTemplate<T, TIPO_ID> {
	
	@PersistenceContext
	private EntityManager manager;
	
	public abstract Class <T> getDomainClass();
	
	public abstract List<T> buscarTodos();
	
	public abstract Optional<T> buscarPorId(TIPO_ID id);
	
	
	public Optional<T> buscarPrimeiro() {
        var jpql = "from " + getDomainClass().getName();
        T entity = manager.createQuery(jpql, getDomainClass()).setMaxResults(1)
                .getSingleResult();

        return Optional.ofNullable(entity);
    }

}
