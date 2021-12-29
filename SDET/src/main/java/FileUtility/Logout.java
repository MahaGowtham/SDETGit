package FileUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	public void logout(WebDriver driver)
	{
		WebElement WT = driver.findElement(By.xpath("//span[text()=' Administrator']/following::img[1]"));
		Actions Act= new Actions(driver);
		Act.moveToElement(WT).click().build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
     }

}
