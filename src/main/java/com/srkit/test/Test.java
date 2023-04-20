package com.srkit.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.srkit.entity.DemoEntity;

public class Test 
{

	public static void main(String[] args) 
	{
	
	  EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	  EntityManager em = factory.createEntityManager();
		
	  //DemoEntity demo = new DemoEntity();
	  
	  // demo.setName("C");
	  
	  EntityTransaction t = em.getTransaction();
	  t.begin();
	  
	  for(int i =1 ; i <=7; i++)
	  {
	  
		  DemoEntity demo = new DemoEntity();
		  demo.setName("AA");
		  em.persist(demo);
	  }
	  
	  t.commit();
	  em.close();
	  factory.close();
	  
	  
	}

}
