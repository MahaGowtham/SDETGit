package FileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.vtiger.genericUtilities.PropertyUtility;

public class BaseClass {
	/*public WebDriver driver;
	PropertyUtility pfile = new PropertyUtility();
	Login in = new Login();
	Logout out = new Logout();
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browser) throws Exception
	{
		System.out.println("Launch the Browser");
		//browser=pfile.readDataFromProperties("browser");
		if(browser.equalsIgnoreCase("chrome"))
				driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver= new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get(pfile.readDataFromProperties("URL"));
	}
	
	@BeforeMethod
	public void createLogin() {
		in.login(driver);
	}
	
	@AfterMethod
	public void signOut()
	{
		out.logout(driver);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
*/
}
