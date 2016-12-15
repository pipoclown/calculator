package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		assertEquals(2, c.add(1,1));
	}
	
	@Test
	public void subtractTest() {
		Calculator c = new Calculator();
		assertEquals(0, c.subtract(1,1));
	}
	
	@Test
	public void divideTest() {
		Calculator c = new Calculator();
		assertEquals(1, c.divide(1,1));
	}
	
	@Test
	public void multiplyTest() {
		Calculator c = new Calculator();
		assertEquals(1, c.multiply(1,1));
	}
	
	@Test
	public void sumTest() {
		Calculator c = new Calculator();
		assertEquals(3, c.sum(1, 1, 1));
	}
	
}