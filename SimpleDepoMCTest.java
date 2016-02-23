import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class SimpleDepoMCTest {

	@Test
	public void test() {
//		SimpleDepoMC depo1 = new SimpleDepoMC(15,1000,LocalDate.of(2013,9,8),20);
//		double interest1 = depo1.interest();
//		assertEquals(8.22,interest1,0.005);
		
		SimpleDepoMC depo2 = new SimpleDepoMC(15,1000,LocalDate.of(2013,9,8),30);
		double interest2 = depo2.interest();
		assertEquals(12.36,interest2,0.005);
//		
//		SimpleDepoMC depo3 = new SimpleDepoMC(15,1000,LocalDate.of(2014,5,12),180);
//		double interest3 = depo3.interest();
//		assertEquals(76.32,interest3,0.005);
	}

}
