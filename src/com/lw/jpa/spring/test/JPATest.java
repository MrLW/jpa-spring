package com.lw.jpa.spring.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lw.jpa.spring.entities.Person;
import com.lw.jpa.spring.service.PersonService;

public class JPATest {
	
	private ApplicationContext ctx = null;
	private PersonService personService = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		personService = ctx.getBean(PersonService.class);
	}
	
	@Test
	public void testPersonService(){
		Person p1 = new Person();
		p1.setAge("55");
		p1.setName("ee");
		
		Person p2 = new Person();
		p2.setAge("66");
		p2.setName("ff");
		
		System.out.println(personService.getClass().getName());
		personService.savePerson(p1, p2);
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
