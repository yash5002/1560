package bulb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lightbulbTest {
	lightbulb mybulb;
	
	
	@Before
	public void setUp() throws Exception {
		mybulb= new lightbulb(1000);
		System.out.println("ADDED WATTAGE");
	}

	@Test
	public void test() {
		mybulb.power(1000);
		assertEquals(2000,mybulb.getBulbwattage());
		System.out.println("ADDED POWER");
	}

}
