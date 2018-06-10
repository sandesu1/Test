package com.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Calculator.class, CalculatorImpl.class})
public class CalculatorTest {

	@Test
	public void testAdd() {
		CalculatorImpl calc = new CalculatorImpl();
		PowerMockito.mockStatic(Calculator.class);
		PowerMockito.when(Calculator.add(3, 7)).thenReturn(10);
		String actualResult = calc.add("3", "7");
		assertEquals("10", actualResult);
	}

}
