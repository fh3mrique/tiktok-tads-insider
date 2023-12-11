package com.api.tadsinsight.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.api.tadsinsight.entities.Linguagem;
import com.api.tadsinsight.repository.template.RepositoryTemplate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class LinguagemRepository extends RepositoryTemplate<Linguagem, Long> {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Class<Linguagem> getDomainClass() {
		return Linguagem.class;
	}
	
	@Override
	public List<Linguagem> buscarTodos() {
		String jpql = "SELECT l FROM Linguagem l";
        TypedQuery<Linguagem> query = manager.createQuery(jpql, Linguagem.class);
        
        
        return query.getResultList();
	}

    @Override
    public Optional<Linguagem> buscarPorId(Long id) {
        Linguagem linguagem = manager.find(Linguagem.class, id);
        return Optional.ofNullable(linguagem);
    }
    
    // Implementação específica para Linguagem
    @Override
    public Linguagem criarEntidade() {
        return new Linguagem();
    }

}
