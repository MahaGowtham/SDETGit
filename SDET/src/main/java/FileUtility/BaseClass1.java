package FileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.genericUtilities.PropertyUtility;

public class BaseClass1 {
	public WebDriver driver;
	PropertyUtility pfile = new PropertyUtility();
	Login in = new Login();
	Logout out = new Logout();
	
	@BeforeClass(groups="smokeTest")
	public void launchBrowser() throws Exception
	{
		System.out.println("Launch the Browser");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(pfile.readDataFromProperties("URL"));
	}
	
	@BeforeMethod(groups="smokeTest")
	public void createLogin() {
		in.login(driver);
	}
	
	@AfterMethod(groups="smokeTest")
	public void signOut()
	{
		out.logout(driver);
	}
	
	@AfterClass(groups="smokeTest")
	public void closeBrowser()
	{
		driver.close();
	}

}
