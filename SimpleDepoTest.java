import java.time.*;

public class SimpleDepoTest {

	public static void main(String[] args) {
		SimpleDepo depo1 = new SimpleDepo(15,1000,LocalDate.of(2012,9,8),20);
		System.out.println(depo1.interest());
		
		SimpleDepo depo2 = new SimpleDepo(15,1000,LocalDate.of(2012,9,8),180);
		System.out.println(depo2.interest());
		
		SimpleDepo depo3 = new SimpleDepo(15,1000,LocalDate.of(2014,9,8),20);
		System.out.println(depo3.interest());
		
		SimpleDepo depo4 = new SimpleDepo(15,1000,LocalDate.of(2014,9,12),180);
		System.out.println(depo4.interest());
	}

}
