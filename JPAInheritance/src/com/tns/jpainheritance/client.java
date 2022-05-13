package com.tns.jpainheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Employee employee =new Employee();
		employee.setName("maisoon");
		employee.setSalary(5000);
		em.persist(employee);
		
		Manager manager = new Manager();//MANAGER CLASS OBJECT
		manager.setName("heeba");
		manager.setSalary(10000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		

		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}

}
