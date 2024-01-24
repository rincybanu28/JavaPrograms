package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Java\\ser.txt"));

		Employee employee = (Employee)objectInputStream.readObject();
		System.out.println(employee);
		objectInputStream.close();

	}

}
