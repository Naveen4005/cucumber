package pages.bootstrap.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.common1;

public class LoginPage extends common1 {
	
	WebDriver driver;
	
	@FindBy(id="nf-field-17") 
	public static WebElement fname;
	
	@FindBy(id="nf-field-18")
	public static WebElement lname;
	
	@FindBy(id="nf-field-19")
	public static WebElement mail;
	
	@FindBy(id="nf-field-20")
	public static WebElement phone;
	
	@FindBy(id="nf-field-22")
	public static WebElement book;
	
	@FindBy(id="nf-field-24")
	public static WebElement month;
	
	
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void main(String[] args) {
		
		entertextwithselenium(driver,fname, "abcd");
		entertextusingjs(driver, lname, "xyz");
		entertextusingactions(driver, mail, "abc@gmail.com");
		phoneusingjs(driver, phone, "123456789");
		selectingbooks(driver, book, 2);
		selectingmonth(driver, month, 3);
		

	}

}
