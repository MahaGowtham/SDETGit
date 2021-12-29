package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//step 1a:Load the driver
				Driver driverRef = new Driver();
				//step 1b:Register the driver
				DriverManager.registerDriver(driverRef);
				//step 2: Establish connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root", "root");
				//step 3: Create the Statement
				Statement stmt = con.createStatement();
				//step 4: Execute the Statement
				
	String query = "Select * from zstudent;";
	ResultSet rs = stmt.executeQuery(query);
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
	}
	
	
	
		//step 6: Close the DB Connection
		con.close();


	}

}
