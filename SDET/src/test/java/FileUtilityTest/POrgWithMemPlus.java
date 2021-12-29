package FileUtilityTest;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.OrgHomePage;
import com.crm.vtiger.objectRepository.PBaseClass;

public class POrgWithMemPlus extends PBaseClass {
	@Test
	public void createOrgWithMemeber() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getOrganizationLink().click();
		
		OrgHomePage ohp = new OrgHomePage(driver);
		ohp.getMemeberPlus().click();
		Thread.sleep(5000);
	}

}
