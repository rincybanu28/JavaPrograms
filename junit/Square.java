package junit;

public class Square {

	public int square(int a) {
		return a*a*a;

	}
	
	public int countA(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='A')
				count++;
		}
		return count;
	}

}
