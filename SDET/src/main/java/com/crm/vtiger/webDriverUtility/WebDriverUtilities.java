package com.crm.vtiger.webDriverUtility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class WebDriverUtilities {

	/**
	 * This method is used for Implicitly Wait
	 * @param driver
	 */
	
	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
/**
 * Used for Explicit wait
 * @param driver
 * @param element
 */
	
	public void waitforElementVisibility(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	/**
	 * used for Accept Alert
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	/**
	 * used for cancelAlert
	 * @param driver
	 */
	
	public void cancelAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	/**
	 * Method used for Mouse Hover
	 * @param driver
	 * @param ele
	 */
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}	
	
	/**
	 * method used for Double Click
	 * @param driver
	 * @param ele
	 */
	
	public void doubleClick(WebDriver driver, WebElement elementLocator)
	{
		Actions action = new Actions(driver);
   action.doubleClick(elementLocator).perform();
}	
	
	/**
	 * Method used for Right Click
	 * @param driver
	 * @param elementLocator
	 */
	
	public void rightClick(WebDriver driver, WebElement elementLocator)
	{
		Actions action = new Actions(driver);
action.contextClick(elementLocator).perform();
}	
	
	/**
	 * Used for Select DropDown by using Text
	 * @param element
	 * @param text
	 */
	
	public void selectDropdownVisibleText(WebElement element, String text)
	
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * Used for Select DropDown by using Index
	 * @param element
	 * @param Index
	 */
	
	public void selectDropdownIndex(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * Used for Select DropDown by using Value
	 * @param element
	 * @param text
	 */
	
	public void selectDropdownValue(String value, WebElement element)
	
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * Used for Switch to Window
	 * @param driver
	 * @param index
	 */
	
	public void switchtoWindow(WebDriver driver, int index) 
	{
	ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(al.get(index));
	}
	
	/**
	 * Used for Take Screenshot
	 * @throws IOException 
	 */
	
	public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable 
	{
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\madhu\\git\\SDET1\\SDET\\photo\\" + screenshotName + ".PNG");
	Files.copy(src, dest);
		
	}
	
	/**
	 * used for Switch Frame by using index
	 * @param driver
	 * @param index
	 */
	
	public void switchFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * used for Switch Frame by using id or name
	 * @param driver
	 * @param locator
	 */
	
	public void switchFrame(WebDriver driver, String locator)
	{
		driver.switchTo().frame(locator);
	}
	
	/**
	 * used for Scroll to WebElement
	 * @param driver
	 * @param argument
	 * @param element
	 */
	
	public void scrolltoWebElement(WebDriver driver, String argument, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(argument, element);
	}
	
}
