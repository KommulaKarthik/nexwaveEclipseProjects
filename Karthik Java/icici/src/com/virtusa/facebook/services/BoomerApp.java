package com.virtusa.facebook.services;

import com.virtusa.facebook.model.LoginDetails;
import com.virtusa.facebook.model.RegistrationDetails;

public class BoomerApp {

	public BoomerApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//BoomerFb app = new BoomerFb();
		
		
		
		YammerFb.linBankAccount();
		RegistrationDetails registrationDetails= new RegistrationDetails();
		registrationDetails.setFullName("Kommula Karthik");
		registrationDetails.setDob("20-12-1998");
		registrationDetails.setEmail("karthik1997@gmail.com");
		registrationDetails.setPassword("******");
		registrationDetails.setPhone(987456321L);
		
		LoginDetails loginDetails = new LoginDetails(registrationDetails.getEmail(),registrationDetails.getPassword());
		
		IFacebook app= new YammerFb();
		YammerFb.linBankAccount();
		app=new BoomerFb();
		app.doSignUp(registrationDetails);
		app.doComment(loginDetails);
		app.doLike(loginDetails);
		app.doPost(loginDetails);
		app.doLogin(loginDetails);
		app.doVideoCall();

		
		IFacebook app2= new BoomerFb();
		YammerFb.linBankAccount();
		app2=new BoomerFb();
		app2.doSignUp(registrationDetails);
		app2.doComment(loginDetails);
		app2.doLike(loginDetails);
		app2.doPost(loginDetails);
		app2.doLogin(loginDetails);
		app2.doVideoCall();
		
		
		INewFacebook app3 = new BoomerFb();
		//app3.doSignUp(registrationDetails);
		//app3.doComment(loginDetails);
		//app3.doLike(loginDetails);
		//app3.doPost(loginDetails);
		//app3.doLogin(loginDetails);
		
		app3.doChat(loginDetails);
		app3.doPostStatus(loginDetails);
		app3.playGames(loginDetails);
		
		BoomerFb fb = new BoomerFb();
		fb.doChat(loginDetails);
		fb.doPostStatus(loginDetails);
		fb.playGames(loginDetails);
		fb.doComment(loginDetails);
		fb.doLike(loginDetails);
		fb.doLogin(loginDetails);
		fb.doPost(loginDetails);
		fb.doSignUp(registrationDetails);
		fb.doVideoCall();
		
	}

}
