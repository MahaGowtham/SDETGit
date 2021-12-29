package FileUtilityTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FileUtility.BaseClass1;

public class CreateLeadsTest extends BaseClass1{
	
	@Test
	public void createLeads() {
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
	}
	

}
