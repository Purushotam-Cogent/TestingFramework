package com.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockitoTesting {
	
	
	
	@Test
	public void test_sumMockitoData()
	{
		Calculator cal=Mockito.mock(Calculator.class);
		Mockito.when(cal.getSum(new Integer[] {2,2})).thenReturn(5);
		System.out.println("Mock is done ");
		assertEquals(4, cal.getSum(new Integer[] {2,2}));
		
		
		
	}
	
	
	@Test
	public void test_sumMockitoData_1()
	{
		Calculator cal=Mockito.mock(Calculator.class);
		Mockito.when(cal.getSum(new Integer[] {2,2})).thenReturn(10);
		System.out.println("Mock is done ");
		assertEquals(15, cal.getSum(new Integer[] {2,2}));
		
		
		
	}

}
