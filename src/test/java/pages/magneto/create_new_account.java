package pages.magneto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class create_new_account extends Common {

	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(id="firstname")
	public static WebElement firstname ;
	
	@FindBy(name="lastname")
	public static WebElement lastname ;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement email ;
	
	@FindBy(id="password")
	public static WebElement password ;
	
	@FindBy(name="password_confirmation")
	public static WebElement password_confirmation ;
	
	public create_new_account(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void create_account(int rowno) throws IOException
	{
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertext(lastname, excelutils.getcellstring(rowno, 3, "data"), driver, "Last Name");
		entertext(email, excelutils.getcellstring(rowno, 5, "data"), driver, "Email");
		entertext(password, excelutils.getcellstring(rowno, 1, "data"), driver, "Password");
		entertext(password_confirmation, excelutils.getcellstring(rowno, 1, "data"), driver, "Password Confirmation");
	}
	

}
