package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertDatainTables {

	public static void main(String[] args) throws SQLException {

		//step 1a:Load the driver
		Driver driverRef = new Driver();
		//step 1b:Register the driver
		DriverManager.registerDriver(driverRef);
		//step 2: Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info", "root", "root");
		//step 3: Create the Statement
		Statement stmt = con.createStatement();
		//step 4: Execute the Statement
 int result = stmt.executeUpdate("Insert into zstudent (stu_name, stu_id, phone_no, department) values ('Meena', 1235, 12345676, 'CSE')");
 if(result==1)
 {
	 System.out.println("Student created successfully");
	
 }
 else
 {
	 System.out.println("Student is not created successfully");
 }
 
 con.close();
	}

}
