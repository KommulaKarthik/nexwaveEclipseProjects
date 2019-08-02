
package com.virtusa.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.virtusa.association.model.Cart;
import com.virtusa.association.model.Items;


public class OneToManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setName("MyCart1");
		
		Items item1 = new Items("I10", 10, 1, cart);
		Items item2 = new Items("I20", 20, 2, cart);
		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(item1); itemsSet.add(item2);
		
		cart.setItems(itemsSet);
		cart.setTotal(10*1 + 20*2);
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Cart.class);
		configuration.addAnnotatedClass(Items.class);
		configuration.configure("hibernate.cfg.xml");	
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cart);
		session.save(item1);
		session.save(item2);
		transaction.commit();
		session.close();
	
		

	
	}
}