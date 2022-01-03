package FileUtilityTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FileUtility.BaseClass1;

public class CreateOrgTest extends BaseClass1{
	
	@Test
	public void createOrg() throws Throwable
	{
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]"));
	}

}
