package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Query query	=entityManager.createQuery("select e from Employee e");
		Query query	=entityManager.createQuery("select e from Employee e where e.exp=?1 and  e.age=?2");
		query.setParameter(1, 3);
		query.setParameter(2, 23);
		List<Employee> emp =query.getResultList();
		for(Employee employee:emp) {
			System.out.println("employee id is "+employee.getId());
			System.out.println("employee age is "+employee.getAge());
			System.out.println("employee exp is "+employee.getExp());
			System.out.println("employee name is "+employee.getName());
			System.out.println("employee gender is "+employee.getGender());
			System.out.println("________________________________");
			
		}

	}

}
