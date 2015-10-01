package test.abhinav.tdd.practise;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.abhinav.tdd.practise.RomanToArabic;

public class TestRomanToArabic {
	
	RomanToArabic ra = new RomanToArabic();
	@Test
	public void testRomanToArabic_Invalid(){
		assertEquals("Invalid Roman Number",ra.convertRomanToArabic("IIX"));
	}
	@Test
	public void testRomanToArabic_Valid(){
		assertEquals("2000",ra.convertRomanToArabic("MM"));
	}
}
