/* Important points:

1. 90% of the methods in the date class are deprecated and usage of these methods in new projects is prohibited.

2. Calendar class replaces all the date class deprecated methods. 

*/

import java.util.Date;

public class DateClass {

	public static void main(String args[  ]) {
		
		//The default constructor in Date class takes the system current date and time. 
		Date d = new Date( );		
		
		System.out.println(d.toString());
				
		System.out.println("Date is "+d.getDate());		
		System.out.println("Month is "+(d.getMonth()+1));
		System.out.println("Year is "+(d.getYear()+1900));
		
		//Returns the number of milliseconds from 1970. This method is used when you want accurate time calculations.
		System.out.println("Current time in milli seconds: "+ System.currentTimeMillis());
		System.out.println("Current time in milli seconds: "+ d.getTime());
		
	/*	Date x = new Date( );	
		x.setTime(1437931826917L);   //set time in milliseconds. Number of milliseconds from 1970.

		Date y = new Date( );
		y.setTime(1437931826917L);

		System.out.println("Date x object: "+x);
		System.out.println("Date y object: "+y);

		//If getTime method of two date objects return same value this method returns true. 		
		if(x.equals(y)) 
			System.out.println("x and y date objects are equal");
		else 
			System.out.println("x and y date objects are not equal");

		 If getTime method of two date objects return same value this method returns zero.
		Returns a negative number if date 'x' comes before date 'y' 
		Returns a positive number if date 'x' comes after date 'y'  		
		System.out.println("Comparing x and y date objects: "+x.compareTo(y));

		x.setYear(2015);
		y.setYear(2016);

		if(x.before(y)) 
			System.out.println("Date x is before date y");

		if(y.after(x)) 
			System.out.println("Date y is after date x");
	*/
	}
}
