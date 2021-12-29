package CRM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Essentials\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost:8888/index.php?action=Login&module=Users");
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
driver.findElement(By.xpath("//input[@name='account_name']"));
driver.findElement(By.xpath("(//td[@class='dvtCellLabel'])[7]/following::img[1]")).click();
ArrayList<String> ref = new ArrayList<String>();
driver.getWindowHandle();
driver.close();


	}
	

}
