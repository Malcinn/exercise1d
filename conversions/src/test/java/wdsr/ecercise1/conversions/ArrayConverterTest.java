package wdsr.ecercise1.conversions;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {

	private ArrayConverter arrayConverter;
	
	@Before
	public void setup(){
		this.arrayConverter = new ArrayConverter();
	}
	
	@Test
	public void testConvertToInts_shouldReturnArrayOfIntegersWhenArgumentIsArrayOfStrings(){
		//given
		String[] strings = {"-2", "5", "10"};
		//when
		int[] ints = arrayConverter.convertToInts(strings);
		org.junit.Assert.assertThat(ints, is(int[].class));
	}
	
	@Test(expected=NullPointerException.class)
	public void testConvertToInts_shouldRiseAnExceptionWhenArgumentIsNull(){
		//given
		String[] strings = null;
		//when
		int[] ints  = arrayConverter.convertToInts(strings);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shouldRiseAnExceptionWhenElementOfArrayCouldNotToBeAnInteger(){
		//given
		String[] strings = {"-2", "a", "4"};
		//when
		int[] ints = arrayConverter.convertToInts(strings);
	}
}
