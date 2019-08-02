package com.virtusa.facebook.app;

import com.virtusa.bank.model.Account;
import com.virtusa.facebook.model.Facebook;
import com.virtusa.facebook.model.LoginDetails;
import com.virtusa.facebook.model.NewFacebook;
import com.virtusa.facebook.model.RegistrationDetails;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
	//Facebook facebook1 = new Facebook("www.facebook.com","Oracle","UK");
	//Facebook facebook = new Facebook("www.fb.com","MySQL","India");
	
	Facebook.companyName="GOOGLE";
			
	System.out.println(Facebook.companyName);
	System.out.println(NewFacebook.companyName);
	
	RegistrationDetails registrationDetails= new RegistrationDetails();
	registrationDetails.setFullName("Kommula Karthik");
	registrationDetails.setDob("20-12-1998");
	registrationDetails.setEmail("karthik1997@gmail.com");
	registrationDetails.setPassword("******");
	registrationDetails.setPhone(987456321L);
	
	LoginDetails loginDetails = new LoginDetails(registrationDetails.getEmail(),registrationDetails.getPassword());
	
	
	Facebook newFaceBook = new NewFacebook();
	newFaceBook.doLinkBankAccount(new Account());
	
	newFaceBook.setUrl("www.nfbk.com");
	newFaceBook.setCountryName("US");
	newFaceBook.setDatabaseName("MongoDB");
	boolean signup=newFaceBook.doSignUp(registrationDetails);
	System.out.println("Signup is done " +signup);
	boolean login=newFaceBook.doLogin(loginDetails);
	
	if(login){
		System.out.println("Successfully logged in");
		newFaceBook.doPost(loginDetails);
		newFaceBook.doComment(loginDetails);
		newFaceBook.doLike(loginDetails);
		//newFaceBook.doShare(loginDetails);
		//newFaceBook.doPayment(loginDetails);
		//newFaceBook.doScheduleEvent(loginDetails);
		
	}else{
		System.out.println("Please signup if you have not registered");
	}
	}
	

}
