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
		person.setAge(22);
		person.setId(101);
		person.setName("Theertha");
		person.setGender("female");
		person.setLoc("kashmir");
		 
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		

	}

}
