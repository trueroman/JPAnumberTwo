package com.jobsukraine.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
	 
     public static void main(String[] args) {
    		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA2.01");
  	      
  	      EntityManager entitymanager = emfactory.createEntityManager( );
  	      entitymanager.getTransaction( ).begin( );

  	      Book book = new Book();
  	      Author Au = new Author();
  	      
  	      entitymanager.merge( book );
  	      entitymanager.merge( Au );
  	      
  	      entitymanager.getTransaction( ).commit( );
  	      entitymanager.close( );
  	      emfactory.close( );
	}
	 
}
