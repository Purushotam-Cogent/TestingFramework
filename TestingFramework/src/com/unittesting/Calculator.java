package com.unittesting;

public class Calculator {
	
	public int getSum(Integer a[])
	{
		System.out.println("Calculator.getSum()");
		Integer sum=0;
		for(Integer i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	

}
