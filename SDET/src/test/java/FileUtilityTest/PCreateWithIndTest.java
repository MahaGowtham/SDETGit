package FileUtilityTest;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.OrgHomePage;
import com.crm.vtiger.objectRepository.PBaseClass;

public class PCreateWithIndTest extends PBaseClass {
	
	@Test//(groups="smokeTest")
	public void createOrgwithIndustryTest() throws Throwable
{
		
		HomePage hp = new HomePage(driver);
		hp.getOrganizationLink().click();
		
		OrgHomePage ohp = new OrgHomePage(driver);
		ohp.getOrgPlus().click();
		ohp.getOrgWithIndustry().click();
		ohp.selectIndustry("Healthcare");
		Thread.sleep(5000);
		
	}

}