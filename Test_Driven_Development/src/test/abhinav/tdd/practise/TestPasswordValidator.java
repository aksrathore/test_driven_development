package test.abhinav.tdd.practise;

import static org.junit.Assert.assertEquals;
import main.java.abhinav.tdd.practise.PasswordValidator;

import org.junit.Test;


public class TestPasswordValidator {
	
	PasswordValidator pwdval = new PasswordValidator();
	
	@Test
	public void testValidLength(){
		assertEquals(true,pwdval.isValidLength("abc1234"));
	}
	@Test
	public void testContainsDigit(){
		assertEquals(true,pwdval.containsDigit("abc1234"));
	}
	@Test
	public void testContainsUpperCase(){
		assertEquals(true,pwdval.containsUpperCaseAlpha("Abc1234"));
	}
	@Test
	public void testPasswordValid(){
		assertEquals(true,pwdval.isPasswordValid("Abc1234"));
	}
	

}
