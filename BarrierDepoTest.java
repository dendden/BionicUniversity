import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class BarrierDepoTest {

	@Test
	public void test() {
		BarrierDepo depo1 = new BarrierDepo(15,1000,LocalDate.of(2012,9,8),20);
		double interest1 = depo1.interest();
		assertEquals(8.20,interest1,0.005);
		
		BarrierDepo depo2 = new BarrierDepo(15,60000,LocalDate.of(2012,9,8),30);
		double interest2 = depo2.interest();
		assertEquals(786.89,interest2,0.005);
		
		BarrierDepo depo3 = new BarrierDepo(15,60000,LocalDate.of(2014,2,8),30);
		double interest3 = depo3.interest();
		assertEquals(789.04,interest3,0.005);
		
		BarrierDepo depo4 = new BarrierDepo(15,100001,LocalDate.of(2014,5,12),180);
		double interest4 = depo4.interest();
		assertEquals(8383.65,interest4,0.005);
	}

}
