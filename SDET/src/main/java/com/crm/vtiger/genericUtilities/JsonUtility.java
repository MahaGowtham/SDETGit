package com.crm.vtiger.genericUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonUtility {
	public String readfromJSON(String Key) throws IOException, ParseException
	{
		FileReader fileInput=new FileReader(IPathConstants.JsonPath);
		JSONParser jp = new JSONParser();
		Object obj = jp.parse(fileInput);
		HashMap hm = (HashMap) obj;
		String value = hm.get(Key).toString();
		return value;
	}

}
