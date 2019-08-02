package com.virtusa.facebook.services;

import com.virtusa.facebook.model.LoginDetails;
import com.virtusa.facebook.model.RegistrationDetails;

public class YammerApp {

	public YammerApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YammerFb app = new YammerFb();
		RegistrationDetails registrationDetails= new RegistrationDetails();
		registrationDetails.setFullName("Kommula Karthik");
		registrationDetails.setDob("20-12-1998");
		registrationDetails.setEmail("karthik1997@gmail.com");
		registrationDetails.setPassword("******");
		registrationDetails.setPhone(987456321L);
		
		LoginDetails loginDetails = new LoginDetails(registrationDetails.getEmail(),registrationDetails.getPassword());
		
		app.doSignUp(registrationDetails);
		app.doComment(loginDetails);
		app.doLike(loginDetails);
		app.doPost(loginDetails);
		app.doLogin(loginDetails);

	}

}
