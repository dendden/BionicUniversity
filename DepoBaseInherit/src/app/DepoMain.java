package app;

import java.time.LocalDate;

public class DepoMain {

	public static void main(String[] args) {
		InterestInterface interests[] = new InterestInterface[6];
		
		interests[0] = new DepoSimple(LocalDate.of(2013,9,8), 20, 1000, 15);
		interests[1] = new DepoSimple(LocalDate.of(2013,9,8), 20, 2500, 18);
		interests[2] = new BarrierDepo(LocalDate.of(2013,9,8), 40, 15000, 11.5);
		interests[3] = new BarrierDepo(LocalDate.of(2013,9,8), 80, 5000, 14);
		interests[4] = new DepoMonthCapitalize(LocalDate.of(2013,9,8), 180, 2000, 16.5);
		interests[4] = new DepoMonthCapitalize(LocalDate.of(2013,9,8), 91, 40000, 12.1);
		
		double sum = 0.0;
		
		for (InterestInterface i : interests) {
			sum += i.getInterest();
		}
		
		System.out.println(sum);
	}

}
