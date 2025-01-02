package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {

	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


Mobile mobile=new Mobile();
mobile.setBrand("MOTO");
mobile.setColor("blue");
mobile.setCost(20000.0);
mobile.setRam("6gb");


Mobile mobile1=new Mobile();
mobile1.setBrand("MOTO");
mobile1.setColor("blue");
mobile1.setCost(20000.0);
mobile1.setRam("6gb");


Sim sim=new Sim();
sim.setProvider("Airtel");
sim.setType("5G");
sim.setPhno(234567890l);
sim.setCost(345678.0);



Sim sim1=new Sim();
sim1.setProvider("Airtel");
sim1.setType("5G");
sim1.setPhno(234567890l);
sim1.setCost(345678.0);




Sim sim2=new Sim();
sim2.setProvider("Airtel");
sim2.setType("5G");
sim2.setPhno(234567890l);
sim2.setCost(345678.0);



Sim sim3=new Sim();
sim3.setProvider("Airtel");
sim3.setType("5G");
sim3.setPhno(234567890l);
sim3.setCost(345678.0);


List<Sim> list= new ArrayList<>();
list.add(sim);
list.add(sim1);


List<Sim> list1= new ArrayList<>();
list1.add(sim2);
list1.add(sim3);


mobile.setSims(list);
mobile1.setSims(list1);

entityTransaction.begin();
entityManager.persist(mobile);
entityManager.persist(mobile1);
entityManager.persist(sim);
entityManager.persist(sim1);
entityManager.persist(sim2);
entityManager.persist(sim3);
entityTransaction.commit();



	}

}
