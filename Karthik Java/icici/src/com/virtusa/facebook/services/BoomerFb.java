package com.virtusa.facebook.services;

import com.virtusa.facebook.model.LoginDetails;
import com.virtusa.facebook.model.RegistrationDetails;

public class BoomerFb implements IFacebook,INewFacebook {

	public BoomerFb() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doLogin(LoginDetails loginDetails) {
		boolean flag=false;
		if(loginDetails!=null){
			System.out.println("Dologin()-- Boomer");
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean doSignUp(RegistrationDetails registrationDetails) {
		boolean flag=false;
		if(registrationDetails!=null){
			System.out.println("Signup from boomerfb is done");
			flag=true;
		}
		return flag;
	}

	@Override
	public void doPost(LoginDetails loginDetails) {
		if(loginDetails!=null){
			System.out.println("Boomer Post is posted successfully by " + loginDetails.getUsername());
		}

	}

	@Override
	public void doLike(LoginDetails loginDetails) {
		if(loginDetails!=null){
			System.out.println("Boomer Post is liked successfully by " + loginDetails.getUsername());
		}

	}

	@Override
	public void doComment(LoginDetails loginDetails) {
		if(loginDetails!=null){
			System.out.println("Boomer Post is commented successfully by " + loginDetails.getUsername());
		}

	}

	@Override
	public void doChat(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		System.out.println("Boomer chat");
		
	}

	@Override
	public void doPostStatus(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		System.out.println("Boomer status");
		
	}

	@Override
	public void playGames(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		System.out.println("Boomer playgames");
		
	}

}
