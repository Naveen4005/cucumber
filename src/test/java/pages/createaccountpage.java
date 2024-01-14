package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class createaccountpage extends Common {
	
WebDriver driver;
	
	@FindBy(name="firstname")
	public static WebElement firstname ;
	
	@FindBy(xpath="//*[@name='lastname']")
	public static WebElement lastname ;
	
	

	public createaccountpage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void createaccount()
	{
		entertext(firstname, "Naveen",driver,"FirstName");
		entertext(lastname, "Reddy",driver,"LastName");
	}
	
	
	


}
