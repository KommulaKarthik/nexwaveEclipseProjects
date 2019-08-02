package com.virtusa.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.virtusa.model.Employee;


public class EmployeeHQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		/*SQLQuery sqlQuery = session.createSQLQuery("select * from employeetab");
		sqlQuery.addEntity(Employee.class);
		List<Employee> empList = sqlQuery.list();
		for(Employee emp:empList){
			System.out.println(emp);
		}*/
		
		
		/*Query query = session.createQuery("select e from Employee e");
		List<Employee> empList = query.list();
		for(Employee emp:empList){
			System.out.println(emp);
		}*/
		
		
		/*Query query = session.createQuery("select e from Employee e where e.employeeId='110' and e.firstName like 'R%'");
		List<Employee> empList = query.list();
		for(Employee emp:empList){
			System.out.println(emp);
		}
		*/
		/*Query query = session.createQuery("select e.firstName,e.lastName,e.salary from Employee e");
		List<Object[]> empList = query.list();
		for(Object[] objArray:empList){
			for(Object obj : objArray ){
				System.out.println(obj);
			}
			System.out.println();
		}*/
		
		/*Query query = session.createQuery("select max(e.salary),avg(e.salary) from Employee e");
		List<Object[]> empList = query.list();
		for(Object[] objArray:empList){
			for(Object obj : objArray ){
				System.out.println(obj);
			}
			System.out.println();
		}*/
		
		/*Query query = session.createQuery("select max(e.salary) from Employee e");
		List<Float> empList = query.list();
		for(float maxsal:empList){
		
			System.out.println(maxsal);
		}*/
		
		/*Query query = session.createQuery("select count(e.employeeId) from Employee e");
		List<Long> empList = query.list();
		for(long empCount:empList){
		
			System.out.println(empCount);
		}*/
		
	/*	Query query = session.createQuery("from Employee e where e.salary > ?0");
		query.setFloat(0, new Scanner(System.in).nextFloat());
		List<Employee> empList = query.list();
		for(Employee emp:empList){
		
			System.out.println(emp);
		}
		*/
		
		/*Query query = session.createQuery("from Employee e where e.salary > :sal");
		query.setFloat("sal", new Scanner(System.in).nextFloat());
		List<Employee> empList = query.list();
		for(Employee emp:empList){
		
			System.out.println(emp);
		}*/
		
		/*Query query = session.createQuery("from Employee e where e.salary > :sal");
		query.setParameter("sal", new Scanner(System.in).nextFloat());
		List<Employee> empList = query.list();
		for(Employee emp:empList){
		
			System.out.println(emp);
		}
		*/
		
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		SimpleExpression condition1= Restrictions.gt("salary",35000.0f);
		criteria.add(condition1);
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		Criterion condition1= Restrictions.gt("salary",35000.0f);
		//Criterion condition1= Restrictions.between("salary", 40000.00f,55000.00f);
		Criterion condition2 = Restrictions.eq("employeeId", 134);
		criteria.add(condition1);
		criteria.add(condition2);
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		Criterion condition1= Restrictions.gt("salary",35000.0f);
		Criterion condition2 = Restrictions.eq("employeeId", 134);
		LogicalExpression condition3 = Restrictions.and(condition1, condition2);
		criteria.add(condition3);
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		Criterion condition1= Restrictions.gt("salary",35000.0f);
		Criterion condition2 = Restrictions.eq("employeeId", 134);
		LogicalExpression condition3 = Restrictions.or(condition1, condition2);
		criteria.add(condition3);
		criteria.addOrder(Order.asc("salary"));
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		Criterion condition1= Restrictions.gt("salary",35000.0f);
		Criterion condition2 = Restrictions.eq("employeeId", 134);
		LogicalExpression condition3 = Restrictions.or(condition1, condition2);
		criteria.add(condition3);
		criteria.addOrder(Order.desc("salary"));
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		Criterion condition1= Restrictions.gt("salary",35000.0f);
		Criterion condition2 = Restrictions.eq("employeeId", 134);
		LogicalExpression condition3 = Restrictions.or(condition1, condition2);
		criteria.add(condition3);
		criteria.addOrder(Order.desc("salary"));
		
		List<Employee> empList = criteria.list();
		for(Employee emp : empList){
			System.out.println(emp);
		}*/
		
		
		/*Criteria criteria = session.createCriteria(Employee.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("firstName")).add(Projections.property("lastName")).add(Projections.property("salary"));
		criteria.setProjection(projectionList);
		List<Object[]> empList = criteria.list();
		for(Object[] objArray : empList){
			for(Object obj:objArray){
			System.out.println(obj);
		}
			System.out.println();
		}*/
		
		Criteria criteria = session.createCriteria(Employee.class);
		ProjectionList projectionList=Projections.projectionList();
		projectionList.add(Projections.countDistinct("employeeId"));
		criteria.setProjection(projectionList);
		List<Long> empList = criteria.list();
		for(long empCount:empList){
			
			System.out.println(empCount);
		}
		
		
		
		
		transaction.commit();
		
		session.close();

	}

}