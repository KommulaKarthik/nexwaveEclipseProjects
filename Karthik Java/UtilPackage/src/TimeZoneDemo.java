import java.text.*;
import java.util.*;

public class TimeZoneDemo {

	public static void main(String[  ] arg) throws Exception {
		
		Calendar cal = Calendar.getInstance(  );
		cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));			
		String r = (cal.get(Calendar.AM_PM)==1) ? "PM" : "AM"; 
		System.out.print("Current date and time in Los angeles is "+cal.get(Calendar.DAY_OF_MONTH)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR)+" ");
	    System.out.println(cal.get(Calendar.HOUR)+" "+cal.get(Calendar.MINUTE)+" "+r);		    

        //Important: getTime( ) method in the calendar class ALWAYS returns default time zone(system) date object.    	    
	    System.out.println("Calender getTime( ) returned value: "+cal.getTime()+"\n");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		formatter.setTimeZone(TimeZone.getTimeZone("Hongkong"));
		System.out.println("Current date and time in Hongkong is "+ formatter.format(new Date( )));
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		formatter2.setTimeZone(TimeZone.getDefault());  //There is also setDefault method. 
		System.out.println("Current date and time in India is "+ formatter2.format(new Date( )));
									
	}		
}
