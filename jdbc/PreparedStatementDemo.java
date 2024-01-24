package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//Rincy banu
public class PreparedStatementDemo {

	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("Connection is established....\n");
	}
	
	public void insertRecord(int id, String name,String email, int age, String city) throws SQLException
	{
		preparedStatement= connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record is inserted");
	}
	
	public void searchByCity(String city) throws SQLException
	{
		preparedStatement=connection.prepareStatement("select * from person where pcity=?");
		preparedStatement.setString(1, city);
		
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.println();
		}
	}
	
	
	public void updateRecord(String city, int id) throws SQLException
	{
		preparedStatement=connection.prepareStatement("update person set pcity= ? where pid = ?");
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2, id);
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" Record is updated");
	}
	
	public void getAllRecords() throws SQLException
	{
		
		
		// execute query
		preparedStatement = connection.prepareStatement("select * from person");
		resultSet=preparedStatement.executeQuery();
		
		// retriving result
		   System.out.println("Id\tName\tEmail\t\t\tAge\tCity");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.println();
		   }
		}
	
	public void deleteRecord(int id) throws SQLException
	{
		preparedStatement=connection.prepareStatement("delete from person  where pid = ?");
		preparedStatement.setInt(1, id);
	
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" Record is deleted");
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementDemo demo= new PreparedStatementDemo();
		int id,age;
		String name,email,city;
		int choice;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your choice.\n 1. Insert new record\n 2. Update Records\n 3. Search by city\n 4. Delete by id\n 5. Display records\n 6. Exit\n");
		 choice=sc.nextInt();
        
		switch(choice)
		{
		case 1:     System.out.println("-----------------Insert Data----------------------");
					System.out.println("Enter Id : ");
					id=sc.nextInt();
					System.out.println("Enter Name : ");
					name=sc.next();
				
					System.out.println("Enter Email : ");
					email=sc.next();
				
					System.out.println("Enter age : ");
					age=sc.nextInt();
					System.out.println("Enter City : ");
					city=sc.next();
					
					demo.insertRecord(id, name, email, age, city);
					break;
		case 2:       System.out.println("-----------------Update Data----------------------");
		              System.out.println("Enter Id : ");
		              id=sc.nextInt();
		              System.out.println("Enter City : ");
					  city=sc.next();
					 
			          demo.updateRecord(city,id);
		             break;
		             
		case 3:   
					System.out.println("----------------Search Data-----------------------");
					System.out.println("Enter City : ");
					city=sc.next();
					//sc.nextLine();
					System.out.println("Search by city : "+city);
					demo.searchByCity(city);
					break;
					
		case 4:    System.out.println("-----------------Delete Data----------------------");
			        System.out.println("Enter Id : ");
			        id=sc.nextInt();
			       
			        demo.deleteRecord(id);
		            break;
		case 5:  System.out.println("-----------------Display Records----------------------\n");
		         demo.getAllRecords();
		         break;
		            
		default:  System.out.println("Invalid Choice");
					
				
		
		}
		
		} while(choice!=6);
		
		
	}
}
