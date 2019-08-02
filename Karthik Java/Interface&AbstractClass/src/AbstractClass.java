
/*
 * You cannot create an object of abstract class  
 * Abstract class can have a constructor and child classes can call that constructor by using super call
 * Go for abstract class when you want a combination of abstract and concrete methods  
 */

abstract class CreditCard 
{
	 
	 /*
        redeemRewardPoints method is marked as abstract because the implementation differ in each class 
        (The procedure to redeem the reward points is not same for all the cards)
        changePin and validatePin methods are made concrete because the implementation is same in all classes
	 */
     public abstract void redeemRewardPoints( );
     public void changePin(int oldpin,int newpin) {  }
     public boolean validatePin(int pin) { return false; }
}

class ClassicCreditCard extends CreditCard {

	@Override
	public void redeemRewardPoints() {
 
		System.out.println("write code here to reedem reward points for classic credit card");
		
	}  
	
}

class SilverCreditCard extends CreditCard  {

	@Override
	public void redeemRewardPoints() {
		
		System.out.println("write code here to reedem reward points for silver credit card");
	}  
	
}

class GoldCreditCard extends CreditCard {

	@Override
	public void redeemRewardPoints() {
		
		System.out.println("write code here to reedem reward points for gold credit card");
	}  	
}

public class AbstractClass {

	public static void main(String[  ] args) {

		
		
	}
}
