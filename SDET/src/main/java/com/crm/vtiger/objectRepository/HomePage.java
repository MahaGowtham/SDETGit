package com.crm.vtiger.objectRepository;
/**
 * POM is a object repository and it's a Java Class
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.vtiger.webDriverUtility.WebDriverUtilities;

public class HomePage extends WebDriverUtilities{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * @FindBy(Locators can be used)
	 * Declared the variables
	 */
	@FindBy(xpath=("(//a[text()='Organizations'])[1]"))
	private WebElement organizationLink;
	
	@FindBy(xpath=("(//a[text()='Leads'])[1]"))
	private WebElement leadsLink;
	
	
	/**
	 * Getting the variables
	 * @return
	 */
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	public WebElement getLeadsLink() {
		return leadsLink;
	}
	
	@FindBy(xpath=("//span[text()=' Administrator']/following::img[1]"))
	private WebElement admintext;
	
	public WebElement getAdministrator() {
		return admintext;
	}
	
   public void selectSignOut() {
	   mouseHover(driver, admintext);
   }
	
   @FindBy(xpath=("//a[text()='Sign Out']"))
   private WebElement logOut;
   
   public WebElement getLogOut() {
	   return logOut;
   }
    
  
    
	
}
