import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestDate {

	@Test
	public void test() {
		SimpleDepo depo1 = new SimpleDepo(15,1000,LocalDate.of(2012,9,8),20);
		double interest1 = depo1.interest();
		assertEquals(8.20,interest1,0.005);
		
		SimpleDepo depo2 = new SimpleDepo(15,1000,LocalDate.of(2012,9,8),180);
		double interest2 = depo2.interest();
		assertEquals(73.84,interest2,0.005);
		
		SimpleDepo depo3 = new SimpleDepo(15,1000,LocalDate.of(2014,9,8),20);
		double interest3 = depo3.interest();
		assertEquals(8.22,interest3,0.005);
		
		SimpleDepo depo4 = new SimpleDepo(15,1000,LocalDate.of(2014,9,12),180);
		double interest4 = depo4.interest();
		assertEquals(73.97,interest4,0.005);
	}

}
