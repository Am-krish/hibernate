package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCollege {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		College college=new College();
		college.setName("BISHOP");
		college.setLoc("karnataka");
		college.setPhno(12345678345909l);
		college.setWebsite("www.mes.com");
		
		
	
		
		entityTransaction.begin();
		entityManager.persist(college);
		//entityManager.persist(college1);
		entityTransaction.commit();

	}

}
