package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		Square sq = new Square();
		int result = sq.countA("skshada");
		assertEquals(3, result);
	}

}
