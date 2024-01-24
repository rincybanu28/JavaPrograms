package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Employee employee = new Employee(101, "Rincy", "Developer");
		
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Java\\ser.txt"));

		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Convert employee object into byte stream");
	}

}
