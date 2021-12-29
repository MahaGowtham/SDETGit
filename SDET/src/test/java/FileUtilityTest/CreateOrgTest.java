package FileUtilityTest;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.HomePage;

import FileUtility.BaseClass;

public class CreateOrgTest extends BaseClass{
	
	@Test
	public void createOrg() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getOrganizationLink().click();
		Thread.sleep(10000);
	}

}
