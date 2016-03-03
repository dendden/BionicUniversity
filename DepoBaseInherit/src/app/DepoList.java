package app;

import java.time.LocalDate;
import java.util.ArrayList;

public class DepoList {
	private ArrayList<DepoBase> depos;
	
	public void init() {
		depos = new ArrayList<DepoBase>();
		
		depos.add(new DepoSimple(LocalDate.of(2013,9,8), 61, 2500, 18));
		depos.add(new DepoMonthCapitalize(LocalDate.of(2012,2,1), 181, 10000, 21));
		depos.add(new DepoSimple(LocalDate.of(2013,11,12), 30, 5500, 15.3));
		depos.add(new BarrierDepo(LocalDate.of(2011,12,18), 370, 43000, 19.56));
		depos.add(new DepoMonthCapitalize(LocalDate.of(2013,7,12), 91, 12000, 16));
	}
	
	public double getPrincipal() {
		double sum = 0.0;
		for ( DepoBase d : depos ) {
			sum += d.getSum();
		}
		
		return sum;
	}
	
}
