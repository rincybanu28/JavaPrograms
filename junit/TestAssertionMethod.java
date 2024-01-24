package junit;

import static org.junit.Assert.*;

import org.junit.Test;
//created by rincy banu
public class TestAssertionMethod {

	@Test
	public void test() {
		int a =10;
		int b =20;
		
		String str1 = new String("Raj");
		String str2 = new String("Raj");
		
		String str3 = "Welcome";
		String str4 = "Welcome";
		
		
		//assertNotSame(str3, str4);
		//assertSame(str1, str2);
		//assertTrue(a==b);
		//assertFalse(a==b);
		
		String s1[] = {"one", "two", "three"};
		String s2[] = {"one", "two", "three"};
		
		assertArrayEquals(s1, s2);
		
	}

}
