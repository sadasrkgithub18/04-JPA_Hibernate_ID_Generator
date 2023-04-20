package com.srkit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srkit.entity.MySqlEntity;

public class TestMySqlDB {

	public static void main(String[] args) 
	{
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

		  EntityManager em = factory.createEntityManager();
			
		  MySqlEntity demo = new MySqlEntity();
		  
		  demo.setName("C");
		  
		  EntityTransaction t = em.getTransaction();
		  t.begin();

		  em.persist(demo);
	  
	  
	     t.commit();
	     em.close();
	     factory.close();
	}

}
