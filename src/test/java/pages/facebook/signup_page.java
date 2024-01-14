package pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class signup_page extends Common {
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(name="firstname")
	public static WebElement firstname ;
	
	@FindBy(name="lastname")
	public static WebElement lastname ;
	
	@FindBy(name="reg_email__")
	public static WebElement email ;
	
	@FindBy(name="reg_passwd__")
	public static WebElement password ;
	
	@FindBy(name="birthday_day")
	public static WebElement birthdate ;
	
	@FindBy(name="birthday_month")
	public static WebElement birthmonth ;
	
	@FindBy(name="birthday_year")
	public static WebElement birthyear ;
	
	@FindBy(xpath="//input[@value='2']")
	public static WebElement gender ;
	
	@FindBy(xpath="//*[contains(text(),'and easy.')]")
	public static WebElement text ;
	
	
	
	
	public signup_page(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void signup_account(int rowno) throws IOException
	{
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertext(lastname, excelutils.getcellstring(rowno, 3, "data"), driver, "Last Name");
		entertext(email, excelutils.getcellstring(rowno, 5, "data"), driver, "Email");
		entertext(password, excelutils.getcellstring(rowno, 1, "data"), driver, "Password");
		selectbyinvisibletext(driver, birthdate, excelutils.getcellstring(rowno, 9, "data"), "Birth Date");
		selectbyinvisibletext(driver, birthmonth, excelutils.getcellstring(rowno, 10, "data"), "Birth Month");
		selectbyinvisibletext(driver, birthyear, excelutils.getcellstring(rowno, 11, "data"), "Birth Year");
		click(gender, driver, "Male");
	}
	
	public void validateUIText(int rowno) throws IOException
	{
		validateuitext(text, excelutils.getcellstring(rowno, 12, "data"));
	}
	
	
}
