package Assessment_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inAmsterdam {

	
	public int countAm(String str) {
		int result =0;
		String count[] =str.split(" ");
		for(int i=0;i< count.length;i++) {
			if (count[i].equalsIgnoreCase("am")){
				result = result+1;
			}
		}
		return result;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String string = sc.readLine();
		inAmsterdam ele = new inAmsterdam();
		try {
			int display = ele.countAm(string);
			System.out.println(display);
		}
		catch(Exception e) {
			
		}

	}

}
