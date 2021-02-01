package com.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestCase {
	Calculator cal;
	
	
	@Before
	public void before()
	{
		System.out.println("1.CalculatorTestCase.before()");
		cal=new Calculator();
		System.out.println("2.Object cal ready to use");
	}
	
	@Test
	public void sum_testwith4number()
	{
		System.out.println("This Test case for {1,2,3,4} => 10 to test logic on my Calculator class");
		
		assertEquals(9, cal.getSum(new Integer[]{1,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4}));
		
		
	}
	
	@After
	
	public void after()
	{
		System.out.println("3.CalculatorTestCase.after()");
		cal=null;
		System.out.println("4.Object cal set null");
	}
	@Test
	public void sum_testwith1number()
	{
		System.out.println("This Test case for {1} => 1 to test logic on my Calculator class");
		
		assertEquals(1, cal.getSum(new Integer[]{1}));
		
	}


}
