package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
		Person person=new Person();
		person.setAge(31);
		person.setGender("male");
		person.setName("das");
		person.setPhno(45678932145l);
		
		
		
		Adhar card1=new Adhar();
		card1.setAdNo(789543278);
		card1.setLoc("kerala");
		card1.setPinNo(690501);
		
		person.setCard(card1);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(card1);
		entityTransaction.commit();
	}

}
