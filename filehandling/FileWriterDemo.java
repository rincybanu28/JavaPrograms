package filehandling;

import java.io.FileWriter;
import java.io.IOException;

//only accept character
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("C:\\Java\\xyz.txt", true);
		writer.write("We are learning file handling.");
		writer.close();
		System.out.println("File is created!");

	}

}
