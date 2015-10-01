package test.abhinav.tdd.practise;

import static org.junit.Assert.assertEquals;
import main.java.abhinav.tdd.practise.StringHandler;

import org.junit.Test;


public class TestStringHandler {

	StringHandler handler = new StringHandler();
	
	@Test
	public void testSwapLastTwoChar_2Chars() {
		assertEquals("BA",handler.swapLastTwoChar("AB"));
	}
	@Test
	public void testSwapLastTwoChar_4Chars() {
		assertEquals("ABDC",handler.swapLastTwoChar("ABCD"));
	}
	@Test
	public void testSwapLastTwoChar_NoChar() {
		assertEquals("",handler.swapLastTwoChar(""));
	}
	@Test
	public void testSwapLastTwoChar_NullValue() {
		assertEquals("",handler.swapLastTwoChar(null));
	}
	@Test
	public void testSwapLastTwoChar_1Char() {
		assertEquals("A",handler.swapLastTwoChar("A"));
	}
	@Test
	public void testSwapLastTwoChar() {
		assertEquals("ABCDEFGHIKJ",handler.swapLastTwoChar("ABCDEFGHIJK"));
	}

}
