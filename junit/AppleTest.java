package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

	@Test
	public void testCorrectColor() { // +ve test case
		Apple apple = new Apple();
		apple.setColor("green");
		assertTrue(apple.checkColor());
	}
	
	@Test
	public void testWrongColor() {  //-ve test case
		Apple apple = new Apple();
		apple.setColor("blue");
		assertFalse(apple.checkColor());
	}

}
