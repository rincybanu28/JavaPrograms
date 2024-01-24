package java8features;

@FunctionalInterface
interface Sayable1 {
	String sayHello(String name);
}

//Created by Rincy banu
public class LmbdaSinglePara {

	public static void main(String[] args) {
		Sayable1 s1 = name -> {
			return "Hello "+name;
		};
		System.out.println(s1.sayHello("Raj"));

	}

}
