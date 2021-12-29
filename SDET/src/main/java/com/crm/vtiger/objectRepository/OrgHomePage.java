package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.vtiger.webDriverUtility.WebDriverUtilities;

public class OrgHomePage {
	WebDriverUtilities wu = new WebDriverUtilities();
    WebDriver driver;
	
	public OrgHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("(//a[text()='Organizations'])[2]/following::a[1]"))
    private WebElement orgPlus;

    public WebElement getOrgPlus() 
    {
	return orgPlus;
    }
    
    @FindBy(xpath=("//select[@name='industry']"))
	private WebElement orgWithIndustry;
		
    public WebElement getOrgWithIndustry()
    {
	return orgWithIndustry;
    }
    
    @FindBy(xpath=("//input[@id='employees']/preceding::img[1]"))
    private WebElement memberPlus;
    
    public WebElement getMemeberPlus() {
    	return memberPlus;
    }
    
    public void selectIndustry(String industry)
	
	{
		wu.selectDropdownVisibleText(orgWithIndustry, industry);
		
	}


}
