package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Essentials\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://localhost:8888/index.php?action=index&module=Home");
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("XYZ");

WebElement WT = driver.findElement(By.xpath("//span[text()=' Administrator']/following::img[1]"));
Actions Act= new Actions(driver);
Act.moveToElement(WT).click().build().perform();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
