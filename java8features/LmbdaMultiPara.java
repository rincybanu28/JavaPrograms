package java8features;

@FunctionalInterface
interface Addable{
	int add(int a, int b);
}

//Created by Rincy banu
public class LmbdaMultiPara {

	public static void main(String[] args) {
		Addable a1 = (x,y) -> x+y;
		System.out.println("Add: "+a1.add(3, 7));
		
		Addable a2 = (int x, int y) -> {
			return x+y;
		};
		System.out.println("Add: "+a2.add(15, 5));

	}

}
