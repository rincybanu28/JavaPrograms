package java8features;

@FunctionalInterface
interface Sayable{
	String sayhello();
	//int add();
}
//Created by Rincy banu
public class LmbdaNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1 = () -> {
			return "Hello user";
		};
		System.out.println(s1.sayhello());

	}

}
