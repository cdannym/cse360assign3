package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calculatorObject = new Calculator();
		assertNotEquals(calculatorObject, null);
	}

	@Test
	public void testGetTotal() {
		Calculator object = new Calculator();
		int result = object.getTotal();
		assertEquals( 0, result );
	}

	@Test
	public void testAdd() {
		Calculator object = new Calculator();
		object.add(3);
		int result = object.getTotal();
		assertEquals(3, result);
	}

	@Test
	public void testSubtract() {
		Calculator object = new Calculator();
		object.subtract(3);
		int result = object.getTotal();
		assertEquals(-3, result);
	}

	@Test
	public void testMultiply() {
		Calculator object = new Calculator();
		object.add(2);
		object.multiply(3); //2 * 2 * 3
		int result = object.getTotal();
		assertEquals(12, result);
	}

	@Test
	public void testDivide() {
		Calculator object = new Calculator();
		object.add(1);
		object.divide(0);
		int result = object.getTotal(); //test for dividing by zero
		assertEquals(0, result);
		Calculator object1 = new Calculator();
		object1.add(4);
		object1.divide(2);
		result = object1.getTotal();
		assertEquals(2, result);
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
