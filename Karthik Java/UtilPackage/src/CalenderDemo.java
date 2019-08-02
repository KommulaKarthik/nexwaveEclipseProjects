import java.util.*;

public class CalenderDemo {

	public static void main(String[  ] args) {

		Calendar cal = Calendar.getInstance();   //Calendar is an abstract class.						 	

		Date d = cal.getTime();		
		System.out.println("Printing date object: "+d);

		System.out.println("Day of month: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month(Starts from zero): "+cal.get(Calendar.MONTH));
		System.out.println("Year: "+cal.get(Calendar.YEAR));		
		System.out.println("Hour of day: "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: "+cal.get(Calendar.MINUTE));		
		System.out.println("AM/PM ?: " +cal.get(Calendar.AM_PM));		
		System.out.println("Day of week: (Sun-1,Mon-2,Tue-3...) "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of week in month: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Day of year: "+cal.get(Calendar.DAY_OF_YEAR));				
		System.out.println("Week of month: "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week of year: "+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Calendar time in milliseconds: "+cal.getTimeInMillis());		

		Calendar c1 = Calendar.getInstance();				

		Calendar c2 = Calendar.getInstance();		
		c2.add(Calendar.YEAR,1);
		System.out.println("New date after adding 1 year to the calender "+c2.getTime());

		if(c1.before(c2))    //like 'before' there is 'after' method too
			System.out.println("Calendar c1 is before c2");
		else 
			System.out.println("Calendar c1 is not before c2");

		Calendar x = Calendar.getInstance();		
		x.set(2016,11,22,5,6,01);					
		x.setLenient(false);
		//System.out.println("Lie test:"+x.get(Calendar.MONTH));

		Calendar y = Calendar.getInstance();
		y.set(2016,11,22,5,6,01);
		y.setLenient(true);

		//Use the compareTo method to compare only the date and time values 
		System.out.println("Comparing x and y calendar objects: "+x.compareTo(y));		

		//Use the equals method to compare both the date&time values and all these calendar parameters/methods : isLenient, getFirstDayOfWeek, getMinimalDaysInFirstWeek and getTimeZone. 
		System.out.println("Is x calendar object equals to y calendar object ?: "+x.equals(y));
		
		Calendar r = Calendar.getInstance();		
		System.out.println("Before rolling calendar date: "+r.getTime());		
		r.roll(Calendar.DATE,10);		
		System.out.println("After rolling calendar date: "+r.getTime());

		Calendar usCal = Calendar.getInstance(new Locale("en","US"));		
		System.out.println("First day of week in US:"+usCal.getFirstDayOfWeek());		

		Calendar c4 = Calendar.getInstance(new Locale("en","GB"));
		System.out.println("First day of week in UK:"+c4.getFirstDayOfWeek());   //you can change default value using setFirstDayOfWeek method.		

		GregorianCalendar gc = new GregorianCalendar( );		
		System.out.println("Is 2016 a leap year ? "+gc.isLeapYear(2016));		
	}	
}
