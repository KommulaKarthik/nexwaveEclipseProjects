
//http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

import java.text.*;
import java.util.*;

public class SimpleDateFormatDemo {

	public static void main(String[ ] args) throws Exception {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'at' hh:mm a");				
		System.out.println("Today's date is "+ formatter.format(new Date( )));		
			
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM-dd-yyyy hh:mm");		
		//By default setLenient is true. Make it false for strict parsing. 	
		//formatter2.setLenient(false);   		
        Date d = formatter2.parse("13-09-2018 10:49");                
        System.out.println("Parsed date is "+ d);
                                        
        /*DateFormatSymbols symbols = new DateFormatSymbols( );
        symbols.setShortWeekdays(new String[ ] { "SU","MO","TU","WE","TH", "FR","SA"});        
        formatter2.setDateFormatSymbols(symbols);
        
        DateFormatSymbols x = formatter2.getDateFormatSymbols();
        System.out.println(Arrays.toString(x.getEras()));
        System.out.println(Arrays.toString(x.getAmPmStrings()));        
        System.out.println(Arrays.toString(x.getShortWeekdays()));
        System.out.println(Arrays.toString(x.getShortMonths()));*/                                                       
	}
}
