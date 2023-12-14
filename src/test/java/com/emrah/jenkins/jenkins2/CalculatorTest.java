package com.emrah.jenkins.jenkins2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CalculatorTest {

	@Test
	
	public void test() {
		Calculator cal = new Calculator();
		assertEquals(10, cal.add(5, 5));
		
	}
		
	

}