package com.crm.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
public String readDataFromProperties(String Key) throws IOException 
{
	FileInputStream fis = new FileInputStream (IPathConstants.PropertyPath);
	Properties pfile = new Properties();
	pfile.load(fis);
	String value = pfile.getProperty(Key);
	return value;
}
}
