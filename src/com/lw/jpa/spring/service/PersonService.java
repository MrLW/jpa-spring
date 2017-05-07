package com.lw.jpa.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lw.jpa.spring.dao.PersonDao;
import com.lw.jpa.spring.entities.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao ;
	
	@Transactional
	public void savePerson(Person p1,Person p2 ){
		personDao.save(p1);
		int i = 1 / 0 ;
		personDao.save(p2);
	}
	
}
