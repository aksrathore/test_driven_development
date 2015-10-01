package test.abhinav.tdd.practise;

import static org.junit.Assert.*;
import main.java.abhinav.tdd.practise.URLSplitter;

import org.junit.Before;
import org.junit.Test;

public class TestURLSpliter {

	URLSplitter urlSpliter = new URLSplitter();
	
	@Before
	public void initialiseUrlSpliter() {
		urlSpliter.urlSpliter("https://www.google.co.in/test/test-url");;
	}
	
	@Test
	public void testGetProtocol() {
		assertEquals("https://", urlSpliter.getProtocol());
	}

	@Test
	public void testGetDomain() {
		assertEquals("www.google.co.in", urlSpliter.getDomain());
	}

	@Test
	public void testGetPath() {
		assertEquals("test/test-url", urlSpliter.getPath());
	}

	

}
