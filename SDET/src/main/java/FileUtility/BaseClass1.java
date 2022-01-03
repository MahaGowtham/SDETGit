package FileUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.genericUtilities.PropertyUtility;

public class BaseClass1 {
	public WebDriver driver;
	public PropertyUtility pfile = new PropertyUtility();
	public Login in = new Login();
	public Logout out = new Logout();
	
	@BeforeClass
	public void launchBrowser() throws Exception
	{
		//System.out.println("Launch the Browser");
		String browser=pfile.readDataFromProperties("browser");
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
	else if(browser.equalsIgnoreCase("firefox"))
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
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

}
