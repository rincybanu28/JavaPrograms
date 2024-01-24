package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//created by rincy banu
public class StatementDemo {
	
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	public StatementDemo() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection is established");
	}
	
	public void getAllRecords() throws SQLException {
		//step 4: create statement
		statement = connection.createStatement();
		
		//step 5: execute statement
		resultSet = statement.executeQuery("select * from person");
		
		//retrieve Result
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("pid")+("\t"));
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5));
			
			System.out.println();
			
		}
		//close connection
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementDemo statementDemo = new StatementDemo();
		statementDemo.getAllRecords();
		

	}

}
