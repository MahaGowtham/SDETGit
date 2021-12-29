package com.crm.vtiger.genericUtilities;

import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataDrivenTesting.ConnectDB;

public class DBUtility {
	ConnectDB ref = new ConnectDB();


	@BeforeTest
	public void connect() throws SQLException {
		ref.dbConnection();
	}

	@Test
	public void execute() throws SQLException {
		ref.executeQuery("select * from zastudent", "Maha", 1);
	}

	@AfterTest
	public void close() throws SQLException {
		ref.closeconnection();


}
}