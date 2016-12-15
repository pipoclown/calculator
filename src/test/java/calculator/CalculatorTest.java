package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		assertEquals(2, c.add(1,1));
	}
}