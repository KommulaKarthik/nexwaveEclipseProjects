import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

// LocalDateTime is a immutable class and it is used to represent date and time. 

public class LocalDateTimeDemo {

	public static void main(String[  ] args) {

		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDateTime datetime = LocalDateTime.of(2016,11,22,4, 46);

		LocalDate date = datetime.toLocalDate();
		System.out.println("Date: " + date);

		Month month = datetime.getMonth();
		int day = datetime.getDayOfMonth();
		int hour = datetime.getHour();		

		System.out.println("Month: " + month +" day: " + day +" hours: " + hour);

		LocalDateTime datetime2 = datetime.withDayOfMonth(25);  	      
		System.out.println(datetime2); 
	}
}
