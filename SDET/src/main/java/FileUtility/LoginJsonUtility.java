package FileUtility;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.vtiger.genericUtilities.JsonUtility;

public class LoginJsonUtility {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
JsonUtility ju = new JsonUtility();
String url = ju.readfromJSON("URL");
String un = ju.readfromJSON("username");
String pwd = ju.readfromJSON("password");
WebDriver driver = new ChromeDriver();
driver.get(url);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google");

}

}
