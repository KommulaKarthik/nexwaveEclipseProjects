import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

// LocalDate is a immutable class and it is used to represent a date.

public class LocalDateDemo {

	public static void main(String[  ] args) {

		//12 December 2014
		LocalDate date = LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("date: " + date);

		//Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Today date: " + today);

		//add 1 week to the current date
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);
		System.out.println("Today date is not changed because LocalDate class is immutable like string: " + today);

		//minus 3 days to the current date 
		LocalDate newDate = today.minus(3,ChronoUnit.DAYS);
		System.out.println("New date after going back 3 days: "+newDate);
		System.out.println("Today date is not changed because LocalDate class is immutable like string: " + today);

		//Get the next Tuesday
		LocalDate d1 = LocalDate.of(2016,Month.NOVEMBER,1);              
		LocalDate nextTuesday = d1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);

		//Get the next Tuesday (If the given date falls on Tuesday return the same date) 
		LocalDate d2 = LocalDate.of(2016,Month.NOVEMBER,1);              
		LocalDate nextTuesday2 = d2.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday2);		
	}	
}
