package DataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
FileReader fr = new FileReader("./JsonFile.json");
JSONParser jp = new JSONParser();
Object parsedFile = jp.parse(fr);
HashMap<?, ?> map = (HashMap<?, ?>) parsedFile;
System.out.println(map.get("URL"));
System.out.println(map.get("username"));
System.out.println(map.get("password"));
	}

}
