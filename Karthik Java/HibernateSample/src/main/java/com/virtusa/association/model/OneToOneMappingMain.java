package com.virtusa.association.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.virtusa.association.model.Author;
import com.virtusa.association.model.Book;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setTitle("Hibernate Made Easy");
        book.setDescription("Simplified Data Persistence with Hibernate and JPA");
        book.setPublishedDate(new Date());
        
        book.setAuthor(new Author("Cameron Wallace McKenzie", "cameron.bckenzie@gmail.com"));
        

		Configuration configuration = new Configuration().configure();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		sessionFactory = configuration.buildSessionFactory(serviceRegistryObj);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		

	}

}
