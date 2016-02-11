import java.time.*;
import java.time.temporal.*;

public class DaysMonthsOld {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1986, 5, 7);
		
		long daysOld = birthday.until(today, ChronoUnit.DAYS);
		long monthsOld = birthday.until(today, ChronoUnit.MONTHS);
		
		System.out.println("I am " + daysOld + " days old.");
		System.out.println("I am " + monthsOld + " months old.");
		
		DayOfWeek birthWeekDay = birthday.getDayOfWeek();
		System.out.println("I was born on " + birthWeekDay.toString() + ".");
	}

}
