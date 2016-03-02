package wdsr.exercise1.logic;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}		
	
	@Test
	public void testMax_shouldReturnMaxValueTrue(){
		// given
		int[] values = {-2, -4 , -100};
		//when
		int max = calculator.max(values);
		// then
		//assertEquals(-2, max);
		// dla assertthat trzeba dodać statyczny import 
		// import static org.hamcrest.CoreMatchers.is;
		assertThat(-2, is(max)); 
	}
	
	@Test
	public void testMax_shouldReturnMaxValueFalse(){
		// given
		int[] values = {-2, -4 , -100};
		//when
		int max = calculator.max(values);
		// then
		//assertFalse(-100 == max);
		assertThat(-100, is(not(max)));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRiseAnExceptionForNullArgument(){
		// given
		int[] values = null;
		// when
		int max = calculator.max(values);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRiseAnExceptionForEmptyArgument(){
		// given
		int[] values = {};
		// when
		int max = calculator.max(values);
	}
}
