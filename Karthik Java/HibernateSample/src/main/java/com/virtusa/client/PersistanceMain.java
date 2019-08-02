package com.virtusa.client;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.model.Employee;

public class PersistanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setEmployeeId(134);
		employee.setFirstName("Rahul");
		employee.setLastName("Reddy");
		employee.setSalary(70000.56f);
		employee.setContactNumber(9949086858L);
		employee.setGender('m');
		employee.setStatus(true);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
		session.close();
		

	}

}