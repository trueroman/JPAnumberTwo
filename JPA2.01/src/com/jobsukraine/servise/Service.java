package com.jobsukraine.servise;
import javax.persistence.EntityManager;

import com.jobsukraine.jpa.Author;
import com.jobsukraine.jpa.Book;


public class Service {

		EntityManager em;
	
		public Service(EntityManager em) {
			super();
			this.em = em;
		}
		
		public Service() {
	
		}
	
		public void createBook(Book book) {
				em.getTransaction().begin();
				em.merge(book);
				em.getTransaction().commit();
		}
		
		public void createBook(Author autor) {
				em.getTransaction().begin();
				em.merge(autor);
				em.getTransaction().commit();
		}	
	
}
