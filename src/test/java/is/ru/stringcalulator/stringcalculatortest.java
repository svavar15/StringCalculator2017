package is.ru.stringcalulator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testNotEmpty1String(){
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testNotEmpty2String(){
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testThreeNumberString(){
		assertEquals(4, Calculator.add("1,2,1"));
	}
	@Test
	public void testNewLinesBetweenNumbers(){
		assertEquals(2, Calculator.add("1\n1"));
	}
}