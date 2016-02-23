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
		int result = object.getTotal(); // result is what the output actually is
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
		Calculator object = new Calculator();
		object.add(2);
		String result = object.getHistory(); 
		String assertion = "0 + 2 "; //assertion is what I want the output to be
		assertEquals( assertion, result );
		
		object.subtract(1);
		result = object.getHistory();
		assertion = "0 + 2 - 1 ";
		assertEquals( assertion, result );
		
		object.multiply(4);
		result = object.getHistory();
		assertion = "0 + 2 - 1 * 4 ";
		assertEquals( assertion, result );
		
		object.divide(2);
		result = object.getHistory();
		assertion = "0 + 2 - 1 * 4 / 2 ";
		assertEquals( assertion, result );
		
		object.divide(0);
		result = object.getHistory();
		assertion = "0 + 2 - 1 * 4 / 2 / 0 ";
		assertEquals( assertion, result );
		
	}

}
