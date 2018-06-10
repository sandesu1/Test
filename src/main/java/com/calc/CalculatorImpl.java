package com.calc;

public class CalculatorImpl implements Calculator {

	public String add(String a, String b) {
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		int z = Calculator.add(x, y);
		
		return z + "";
	}

}
