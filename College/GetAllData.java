package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

	Query query	=entityManager.createQuery("select c from  College c");
	List<College> list =query.getResultList();
	for(College  college:list) {
		System.out.println("College id is "+college.getId());
		System.out.println("College name is "+college.getName());
		System.out.println("College website is "+college.getWebsite());
		System.out.println("College phno is "+college.getPhno());
		System.out.println("College location is "+college.getLoc());
		System.out.println("________________________");
		
	}

	}

}
 