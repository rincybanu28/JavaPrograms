package designpatterns;
//Created by Rincy banu
class SingleObject{
	
	//create an object
	private static SingleObject instance = new SingleObject();
	//create private constructor so that this class cannot be 
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("Accessing method using single object");
	}
}

public class SingletonPatternEx {

	public static void main(String[] args) {
		//we cant create object of singleton class because constructor is private
		SingleObject obj = SingleObject.getInstance();
		obj.show();

	}

}
