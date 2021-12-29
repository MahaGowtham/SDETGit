package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("./CommonData.Properties.txt");
Properties p = new Properties();
p.load(fis);
String URL = p.getProperty("URL");
String UN = p.getProperty("username");
String PWD = p.getProperty("password");
String BRW = p.getProperty("browser");
System.out.println(URL);
System.out.println(UN);
System.out.println(PWD);
System.out.println(BRW);
if(BRW.equals("chrome")) {
	System.out.println("Browser is Chrome");
}
else {
	System.out.println("Browser is firefox");
}
	}

}
