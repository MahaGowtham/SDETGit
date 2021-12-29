package FileUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public void login(WebDriver driver) {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
			}

}
