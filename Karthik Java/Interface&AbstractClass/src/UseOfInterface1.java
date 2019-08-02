/*

What is abstraction ?

Abstraction means hiding the implementation details only the functionality is shown 
to the user.

Interface is used to achieve abstraction 

*/

interface FundTransfer
{
	
	/* Implementation details are hidden here because the methods do not have any body they are ending with semicolon
	 * Every FundTransfer MUST have these 2 functionalities - transfermoney and transfercharges 	 
	 */
	
	public abstract boolean transferMoney( );
	public abstract float transferCharges( );

}

class Imps implements FundTransfer {

	@Override
	public boolean transferMoney() {
		System.out.println("write code here to perform imps transfer");
		return false;
	}

	@Override
	public float transferCharges() {
		System.out.println("write code here to calculate charges for IMPS");
		return 0;
	} 
	
}

class Neft implements FundTransfer {

	@Override
	public boolean transferMoney() {
		System.out.println("write code here to perform inter bank transfer");
		return false;
	}

	@Override
	public float transferCharges() {
		System.out.println("write code here to calculate charges for NEFT");
		return 0;
	}
	
}


class Rtgs implements FundTransfer {

	@Override
	public boolean transferMoney() {
		System.out.println("write code here to perform RTGS transfer");
		return false;
	}

	@Override
	public float transferCharges() {
		System.out.println("write code here to calculate charges for RTGS");
		return 0;
	} 		
}
