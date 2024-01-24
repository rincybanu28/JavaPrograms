package jdbc;
//step1: import package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection connection;
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException
	{
		if(connection == null) 
		{
			//step2: register your driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step3: Establish connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch10741","root","Rbkb@123");
			
			return connection;
		}
		else
		{
			return connection;
		}
		
	}
}
