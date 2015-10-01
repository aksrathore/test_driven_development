package test.abhinav.tdd.practise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.java.abhinav.tdd.practise.TwoNumbersSum;

public class TestTwoNumbersSum {
	@Test
	public void testDoSum() {
		TwoNumbersSum sum = new TwoNumbersSum();
		assertEquals(7, sum.doSum(3, 4));
		assertEquals(7, sum.doSum(100, 4));
		assertEquals(87, sum.doSum(3, -90));
		assertEquals(16, sum.doSum(12, 4));
	}
}
