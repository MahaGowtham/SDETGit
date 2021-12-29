package com.crm.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(name="user_name")
	private WebElement un;
	
	@FindBy(name="user_password")
	private WebElement pwd;
	
	@FindBy(id="submitButton")
	private WebElement lbt;
	
	public WebElement getUsername() {
		return un;
	}
	
	public WebElement getPassword() {
		return pwd;
	}
	
	public WebElement getLoginButton() {
		return lbt;
	}

	public void loginApp(String user, String pass) {
		un.sendKeys(user);
		pwd.sendKeys(pass);
		lbt.click();
	}
	
	}


