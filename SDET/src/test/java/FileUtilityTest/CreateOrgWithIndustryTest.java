package FileUtilityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import FileUtility.BaseClass1;

public class CreateOrgWithIndustryTest extends BaseClass1 {
	
	@Test
	public void createOrgwithIndustry()
	{
        driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[2]/following::a[1]")).click();
		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		industry.selectByVisibleText("Healthcare");
		
		driver.findElement(By.xpath("//input[@type='text']/following-sibling::img[1]")).click();
	}

	}


