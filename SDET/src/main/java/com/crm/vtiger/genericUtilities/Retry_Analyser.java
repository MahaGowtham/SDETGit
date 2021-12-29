package com.crm.vtiger.genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


/**
 * check with PcreateLeadsTest Program
 * @author madhu
 *
 */
public class Retry_Analyser implements IRetryAnalyzer{

	private int count=0;
	private int retry_count=3;
	public boolean retry(ITestResult result) {
         while(count<retry_count) {
        	 count++;
        	 return true;
         }
		
		return false;
	}

}
