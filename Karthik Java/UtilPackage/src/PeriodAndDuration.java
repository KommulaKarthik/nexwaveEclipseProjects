import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

// LocalTime is a immutable class and is used to represent a time. 

public class PeriodAndDuration {

	public static void main(String[  ] args) {
		
	      //Get the current date
	      LocalDate date1 = LocalDate.now();	      
				      
	      //A person date of birth
	      LocalDate date2 = LocalDate.of(1988,Month.JANUARY,15);
	      	      	      
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);	      	      
	      	      
	      //Get the current time
	      LocalTime time1 = LocalTime.now();	      
			
	      LocalTime time2 = LocalTime.of(12,00);
	      	      	      
	      Duration duration = Duration.between(time2, time1);
			
	      System.out.println("Duration: " + duration);
	}
}
