package com.virtusa.zomato.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.virtusa.zomato.exception.ZomatoException;
import com.virtusa.zomato.model.CustomerDetail;
import com.virtusa.zomato.model.LoginDetail;

public class ZomatoDaoTest {

	
	private static ZomatoDao dao = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		dao= new ZomatoDao();
		System.out.println("@Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao=null;
		System.out.println("@After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before Method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After Method");
	}

	@Test
	public void testZomatoDao() {
		
	}

	@Test(expected=ZomatoException.class)
	public void testDoLoginCheck() {
		
		System.out.println("Do Login Check");
		
		LoginDetail detail  = new LoginDetail("karthik@gmail.com","root");
		
		
		try{
			int flag=dao.doLoginCheck(detail);
			
			assertEquals(1,flag);
		}catch(ZomatoException e){
			e.printStackTrace();
		}
	}
	
	@Test(expected=ZomatoException.class)
	public void testDoRegistrationCheck() {
		System.out.println("Do Registration Check");
		CustomerDetail customerDetail = new CustomerDetail(0, "Karthik", "Hyderabad", "9876543215", "karthik@gmail.com","1234");
		//customerDetail.setPassword("1234");
		int flag=0;
		try{
			flag = dao.registerCustomer(customerDetail);
			
			
		}catch(ZomatoException e){
			System.out.println(e.getMessage());
			assertTrue(flag>0);
		}
	}


	@Test
	public void testRegisterCustomer() {
		
	}

	@Test
	public void testSearchRestaurants() {
		
	}

}
