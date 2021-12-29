package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.webDriverUtility.WebDriverUtilities;

public class LogoutPage {
WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//span[text()=' Administrator']/following::img[1]"))
	private WebElement adminText;
	
	public WebElement getAdministrator() {
		return adminText;
	}
	
	public void administrator() {
		LogoutPage lop = new LogoutPage(driver);
		WebDriverUtilities wu = new WebDriverUtilities();
		wu.mouseHover(driver, adminText);
	}

	@FindBy(xpath=("//a[text()='Sign Out']"))
    private WebElement signOut;
	
	public WebElement getSignOut() {
		return signOut;
	}
	
	public void logout() {
		signOut.click();
	}
}
