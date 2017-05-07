package com.lw.jpa.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lw.jpa.spring.entities.Person;

@Repository
public class PersonDao {

	
	
	@PersistenceContext
	private EntityManager entityManager ;
	
	public void save(Person person){
		entityManager.persist(person);
	}
}
