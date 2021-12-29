package com.crm.vtiger.genericUtilities;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtilities {
	
	@Test
	/*public int getRandomNumber()
	{
		Random rdm = new Random();
		int Rnum = rdm.nextInt(1000);
		return Rnum;
	}*/
	
	public String getSystemDate()
	{
		Date date = new Date();
		String systemdate = date.toString().replace(" ", "_").replace(":", "_");
		return systemdate;
		
	}
	
	

}
