package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=new Employee();
		entityTransaction.begin();
	Query query	=entityManager.createQuery("update Employee set exp=?1 where id=?2");
	query.setParameter(1, 5);
	query.setParameter(2, 2);
	int update=query.executeUpdate();
			System.out.println("row updated"+update);
		//List<Employee> h =query.getResultList();
	
		entityTransaction.commit();
		
		

	}

}
