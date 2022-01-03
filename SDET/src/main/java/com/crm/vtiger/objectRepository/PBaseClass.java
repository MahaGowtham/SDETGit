package com.crm.vtiger.objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.vtiger.genericUtilities.JavaUtilities;
import com.crm.vtiger.genericUtilities.PropertyUtility;
import com.crm.vtiger.webDriverUtility.WebDriverUtilities;

public class PBaseClass extends WebDriverUtilities{
	
	public WebDriver driver;
	
	 public static WebDriver statWD;
		public PropertyUtility pfile = new PropertyUtility();
		public WebDriverUtilities wu = new WebDriverUtilities();
		public JavaUtilities ju = new JavaUtilities();
	
		//HomePage hp = new HomePage(driver);
		
		/**
		 * Parameters is used for cross browser parallel testing
		 * @throws Exception
		 */
		//@Parameters("browser")
		
		@BeforeClass(groups={"SmokeTest","RegressionTest"})
		//public void launchBrowser(String browser) throws Exception
		public void launchBrowser() throws Exception
		{
			//System.out.println("Launch the Browser");
			String browser=pfile.readDataFromProperties("browser");
			 //browser=pfile.readDataFromProperties("browser");
			
			if(browser.equalsIgnoreCase("chrome"))
					driver=new ChromeDriver();
			else if(browser.equalsIgnoreCase("firefox"))
				driver= new FirefoxDriver();
			
			statWD=driver;
			driver.manage().window().maximize();
			driver.get(pfile.readDataFromProperties("URL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@BeforeMethod(groups={"SmokeTest","RegressionTest"})
		public void createlogin() throws Exception {
			LoginPage lp = new LoginPage(driver);
			String user = pfile.readDataFromProperties("username");
			String pass = pfile.readDataFromProperties("password");
			lp.loginApp(user, pass);
		}
		
		@AfterMethod(groups={"SmokeTest","RegressionTest"})
		public void logoutPage() {
			LogoutPage lop = new LogoutPage(driver);
			lop.administrator();
			lop.logout();
		}
		
		@AfterClass(groups={"SmokeTest","RegressionTest"})
		public void closeBrowser() {
			statWD.close();
		}
		
		}
		
		


