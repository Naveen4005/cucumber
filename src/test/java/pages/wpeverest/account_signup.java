package pages.wpeverest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class account_signup extends Common{
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="//a[contains(text(), 'Guest')]")
	public static WebElement createaccount_button;
	
	public account_signup(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void create_account_button()
	{
		click(createaccount_button, driver, "Create Account");
	}
}
