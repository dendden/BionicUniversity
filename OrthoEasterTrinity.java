import java.time.*;
import java.time.format.DateTimeFormatter;

public class OrthoEasterTrinity {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		// Printing Orthodox Easter dates for current decade (2010 - 2019 yy):
		System.out.println("*****EASTERS*****");
		for ( int year = 2010; year < 2020; year++ ) {
			LocalDate easter = orthodoxEaster(year);
			String dateToPrint = easter.format(formatter);
			String weekDayCheck = easter.getDayOfWeek().toString();
			
			System.out.println(dateToPrint + " (" + weekDayCheck + ")");
		}
		
		//Printing Orthodox Trinity dates for current decade (2010 - 2019 yy):
		System.out.println();
		System.out.println("****TRINITIES****");
		for ( int year = 2010; year < 2020; year++ ) {
			LocalDate trinity = orthodoxTrinity(year);
			String dateToPrint = trinity.format(formatter);
			String weekDayCheck = trinity.getDayOfWeek().toString();
			
			System.out.println(dateToPrint + " (" + weekDayCheck + ")");
		}
	}
	static LocalDate orthodoxEaster(int year) {
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int d = (19 * a + 15) % 30;
		int e = (2 * b + 4 * c + 6 * d + 6) % 7;
		int f = d + e;
		
		if ( f <= 9 ) {
			return LocalDate.of(year, 3, 22+f).plusDays(13);
		} else {
			return LocalDate.of(year, 4, f-9).plusDays(13);
		}
	}
	
	static LocalDate orthodoxTrinity(int year) {
		return orthodoxEaster(year).plusDays(49);
	}
}
