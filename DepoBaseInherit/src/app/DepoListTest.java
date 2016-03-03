package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepoListTest {

	@Test
	public void test() {
		DepoList dList = new DepoList();
		dList.init();
		assertEquals(73000.0,dList.getPrincipal(),0.005);
	}

}
