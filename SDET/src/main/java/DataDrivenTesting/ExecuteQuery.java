package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {
	

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
				int result=stmt.executeUpdate("CREATE TABLE XSTUDENT (STU_NAME VARCHAR(25) NOT NULL, STU_ID int, PHONE_NO int NOT NULL, DEPARTMENT VARCHAR(25), PRIMARY KEY (STU_ID))");
				//step 5: Process the Statement
				/*if(result==0) {
					System.out.println("Table Created Successfully");
				}
				else {
					
					System.out.println("Query is not OK");
				}*/
				
				String result1 = "Select * from zstudent;";
				int rs = stmt.executeUpdate(result1);
				System.out.println(result1);
				//step 6: Close the DB Connection
				con.close();


	}

}
