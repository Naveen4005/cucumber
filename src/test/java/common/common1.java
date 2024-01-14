package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class common1 {

	public void click(WebElement ele, WebDriver driver) {
		try {
			if(ele.isDisplayed()) {
				borderandbackgroundhilight(ele, driver);
				ele.click();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void entertext(WebElement ele, String str, WebDriver driver) {
		try {
			if(ele.isDisplayed()) 
			{
				borderandbackgroundhilight(ele, driver);
				ele.sendKeys(str);
				
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		public static void borderandbackgroundhilight(WebElement ele, WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='2px solid red';", ele);
			js.executeScript("arguments[0].style.background='yellow';", ele);
		}
		public static void entertextwithselenium(WebDriver driver,WebElement ele, String str) {
			
			borderandbackgroundhilight(ele, driver);
			ele.sendKeys(str);
		}
		public static void entertextusingjs(WebDriver driver,WebElement ele, String str) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='"+str+"';", ele);
			borderandbackgroundhilight(ele, driver);
		}
		public static void entertextusingactions(WebDriver driver,WebElement ele, String str) {
			
			Actions act=new Actions(driver);
			act.sendKeys(ele, str).perform();
			borderandbackgroundhilight(ele, driver);
		}
		public static void phoneusingjs(WebDriver driver,WebElement ele, String str) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='"+str+"';", ele);
			borderandbackgroundhilight(ele, driver);
		}
		public static void selectingbooks(WebDriver driver,WebElement ele, Integer index) {
			
			Select books=new Select(ele);
			books.selectByIndex(index);
			borderandbackgroundhilight(ele, driver);
		}
		public static void selectingmonth(WebDriver driver,WebElement ele, Integer index) {
			
			Select months=new Select(ele);
			months.selectByIndex(index);
			borderandbackgroundhilight(ele, driver);
		}
	}
