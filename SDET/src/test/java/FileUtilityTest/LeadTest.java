package FileUtilityTest;

import org.testng.annotations.Test;

import com.crm.vtiger.objectRepository.HomePage;
import com.crm.vtiger.objectRepository.PBaseClass;


public class LeadTest extends PBaseClass {
	
	@Test(groups={"SmokeTest","RegressionTest"})
	public void createLeads() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.getLeadsLink().click();
	}

}
