package com.virtusa.facebook.model;

import com.virtusa.bank.model.Account;
import com.virtusa.facebook.exception.TooMuchDataException;

public class NewFacebook extends Facebook {
	private int textDataLimit;
	private int videoFileLimit;
	private int audioFileLimit;

	public NewFacebook(String url, String databaseName, String countryName, int textDataLimit, int videoFileLimit,
			int audioFileLimit) {
		super(url, databaseName, countryName);
		this.textDataLimit = textDataLimit;
		this.videoFileLimit = videoFileLimit;
		this.audioFileLimit = audioFileLimit;
	}
	@Override
	public boolean doSignUp(RegistrationDetails registrationDetails) {
		// TODO Auto-generated method stub
		
		boolean flag=super.doSignUp(registrationDetails);
		System.out.println("Linking the G-Pay to the user for payment is done");
		return flag;
		
		
	}
	public void doShare(LoginDetails loginDetails) {
		if(loginDetails!=null){
			if(this.textDataLimit>=10000){
				
			}
		System.out.println("Successfully shared on timeline by " + loginDetails.getUsername());
		}
	}
	
	public void doPayment(LoginDetails loginDetails){
		if(loginDetails!=null){
		System.out.println("Successfull payment done by " + loginDetails.getUsername());
		}
	}
	
	public void doScheduleEvent(LoginDetails loginDetails){
		if(loginDetails!=null){
		System.out.println("Successfull schedule event done by " + loginDetails.getUsername());
		}
	}
	public NewFacebook() {
		super();
		System.out.println("New Facebook constructor");
		// TODO Auto-generated constructor stub
	}
	public NewFacebook(String url, String databaseName, String countryName) {
		super(url, databaseName, countryName);
		System.out.println("New Facebook parameterised constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doLinkBankAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Bank Account is linked by new facebook");
		
	}
	
	

	

}
