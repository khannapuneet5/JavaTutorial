package com.msci.calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calc;
	@Before
	public void setUp(){
		calc = new Calculator();
	}
	
	@After
	public void tearDown(){
		calc = null;
	}
	
	@Test
	public void testAdd() {
		double sum = calc.add(10, 20);
		assertTrue(sum == 30);
	}
	
	@Test
	public void testAdd1() {
		double sum = calc.add(100000000, 200000000);
		assertTrue(sum == 300000000);
	}
	
	
	@Test
	public void testSub() {
		double diff = calc.subtract(10, 20);
		assertTrue(diff == -10);
	}
	
	@Test
	public void testSub1() {
		double diff = calc.subtract(-10, 20);
		assertTrue(diff == -30);
	}
	
}
