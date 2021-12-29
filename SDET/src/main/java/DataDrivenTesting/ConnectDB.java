package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.crm.vtiger.genericUtilities.IPathConstants;
import com.mysql.cj.jdbc.Driver;

public class ConnectDB {
	Connection con;

	public void dbConnection() throws SQLException 
	{
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		con=DriverManager.getConnection(IPathConstants.DBpath,IPathConstants.DBname,IPathConstants.DBpassword);
		System.out.println("Database connected successfully");
}

	public void executeQuery(String Query,String expectedres,int columnIndex ) throws SQLException
	{
		ResultSet result = con.createStatement().executeQuery(Query);

		boolean flag = false;

		while(result.next()) {

			String actualres = result.getString(columnIndex);
			if(expectedres.equalsIgnoreCase(actualres)) {
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("query executed");
		}
		else{

			System.out.println("query not executed");
		}


	}

	public void closeconnection() throws SQLException
	{
		con.close();
		System.out.println("Database connection closed successfully");


	}

}
