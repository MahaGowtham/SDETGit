package FileUtilityTest;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.PBaseClass;

public class OrgTest extends PBaseClass{
	@Test
	public void createOrg() {
		HomePage hp = new HomePage(driver);
		hp.getOrganizationLink().click();
	}
}
