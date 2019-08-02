package com.virtusa.facebook.services;

import com.virtusa.facebook.model.LoginDetails;
import com.virtusa.facebook.model.RegistrationDetails;

public class YammerFb implements IFacebook {

	public YammerFb() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean doLogin(LoginDetails loginDetails){
		boolean flag=false;
		if(loginDetails!=null){
			System.out.println("Dologin()-- Yammer");
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean doSignUp(RegistrationDetails registrationDetails){
		boolean flag=false;
		if(registrationDetails!=null){
			System.out.println("Signup from yammerfb is done");
			flag=true;
		}
		return flag;
	}
	@Override
	public void doPost(LoginDetails loginDetails){
		if(loginDetails!=null){
			System.out.println("Yammer Post is posted successfully by " + loginDetails.getUsername());
		}
	}
	@Override
	public void doLike(LoginDetails loginDetails){
		if(loginDetails!=null){
			System.out.println("Yammer Post is liked successfully by " + loginDetails.getUsername());
		}
	}
	@Override
	public void doComment(LoginDetails loginDetails){
		if(loginDetails!=null){
			System.out.println("Yammer Post is commented successfully by " + loginDetails.getUsername());
		}
	}
	public static void linBankAccount(){
		System.out.println("Bank account linked to YammerFb ");
	}

}
