package common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Common extends BaseTest {
	
//	WebDriver driver;
	static Actions act;
	
	public void click(WebElement ele,WebDriver driver,String elementName )
	{
		try
		{
			if(ele.isDisplayed())
			{
				reportpass(test, "user should click the <B>"+elementName+"</B>", "</B>user is able to click the <B>"+elementName+"</B>",driver);
				borderandbackgroundhilightusingjs(ele, driver);

				ele.click();
			}
			else
			{
				reportfail(test, "user should click the <B>"+elementName+"</B>", "</B>user is not able to click the <B>"+elementName+"</B>", driver);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void entertext(WebElement ele,String str,WebDriver driver,String elementName)
	{
		try
		{
			if(ele.isDisplayed())
			{
				reportpass(test, "user should enter the data into <B>"+elementName+"</B> as <B>" +str, "</B>user is able to enter the data into <B>"+elementName+"</B> as <B>" +str,driver);
				borderandbackgroundhilightusingjs(ele, driver);
				ele.sendKeys(str);
			}
			else
			{
				reportpass(test, "user should enter the data into <B>"+elementName+"</B> as <B>" +str, "</B>user is not able to enter the data into  <B>"+elementName+"</B> as <B>" +str,driver);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static  void borderandbackgroundhilightusingjs(WebElement ele, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.border='2px solid red';", ele);
		js.executeScript("arguments[0].style.background='yellow';", ele);
	}
	
	public  void entertextusingjs(WebElement ele, WebDriver driver, String str,String elementName) {
		try
		{
		borderandbackgroundhilightusingjs(ele, driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+str+"'", ele);
		reportpass(test, "user should enter the data into <B>"+elementName+"</B> as <B>" +str, "</B>user is able to enter the data into <B>"+elementName+"</B> as <B>" +str,driver);

		}
		catch(Exception e)
		{
			reportpass(test, "user should enter the data into <B>"+elementName+"</B> as <B>" +str, "</B>user is not able to enter the data into <B>"+elementName+"</B> as <B>" +str,driver);
		}

	}
	
	public  void copydatausingactions(WebDriver driver) {
		act =new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}
	
	public  void presstabusingactions(WebDriver driver) {
		act =new Actions(driver);
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
	}
	
	public  void pasteusingactions(WebDriver driver) {
		act =new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}
	
	public  void selectbyinvisibletext(WebDriver driver,WebElement ele,String str,String elementName) {
		try
		{
		borderandbackgroundhilightusingjs(ele, driver);
		Select sel=new Select(ele);
		sel.selectByVisibleText(str);
		reportpass(test, "user should select the <B>"+elementName+"</B> dropdown as <B>" +str, "</B>user is able to select the <B>"+elementName+"</B> dropdown as <B>" +str, driver);
		}
		catch(Exception e)
		{
			reportfail(test, "user should select the <B>"+elementName+"</B> dropdown as <B>" +str, "</B>user is not able to select the <B>"+elementName+"</B> dropdown as <B>" +str, driver);
		}
	}
	
	public  void selectbyindex(WebDriver driver,WebElement ele,int n,String elementName) {
		try
		{
		borderandbackgroundhilightusingjs(ele, driver);
		Select office=new Select(ele);
		office.selectByIndex(n);
		String str=office.getFirstSelectedOption().getText();
		reportpass(test, "user should select the <B>"+elementName+"</B> dropdown as <B>" +str, "</B>user is able to select the <B>"+elementName+"</B> dropdown as <B>" +str, driver);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public  void copydatausingrobotclass() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
	public void validateuitext(WebElement ele,String text)
	{
		String actualtext=ele.getText();
		if(actualtext.equals(text))
		{
			reportpass(test, "User should validate text as"+text, "USer is able to validate text as"+text, driver);
		}
		else
		{
			reportfail(test, "User should validate text as"+text, "USer is not able to validate text as"+text, driver);
		}
	}
	public void selectcalendar(String year,String month,String date,WebDriver driver)
	{
		Select Year=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
		Year.selectByValue(year);
		
		Select Month=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		Month.selectByValue(month);
		
		List<WebElement> Date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement ele:Date)
		{
			if(ele.getText().equals(date))
			{
				ele.click();
			}
		}

	}

}
