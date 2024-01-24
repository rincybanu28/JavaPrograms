package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {

		FileOutputStream outputStream = new FileOutputStream("C:\\Java\\abc.txt",true);//true for appending data,will keep previous data and add new data alone with it
		String str = ", We are learning file handling.. "; //store this data in abc.txt
		byte bArray[] = str.getBytes();//convert string into byte, getByte method is used to convert string data into byte
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File is created");
	}

}
