package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test //creating test case
	public void test() {
		Square sq = new Square();
		int result = sq.square(3);
		assertEquals(9, result);
		
	}

}
