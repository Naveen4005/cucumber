package pages.wpeverest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class signup_text_fields extends Common{
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(id="first_name")
	public static WebElement firstname ;
	
	@FindBy(id="last_name")
	public static WebElement lastname ;
	
	@FindBy(id="user_email")
	public static WebElement email ;
	
	@FindBy(id="radio_1665627729_Male")
	public static WebElement gender ;
	
	@FindBy(id="user_pass")
	public static WebElement password ;
	
	@FindBy(xpath="(//*[@aria-label='Month'])[1]")
	public static WebElement month ;
	
	@FindBy(xpath="(//*[@class='numInputWrapper'])[1]/input")
	public static WebElement year ;
	
	@FindBy(xpath="//*[@aria-label='April 15, 1997']")
	public static WebElement date ;
	
	@FindBy(xpath="//*[@data-label='Nationality']")
	public static WebElement nationality ;
	
	@FindBy(id="phone_1665627880")
	public static WebElement phonenumber ;
	
	@FindBy(xpath="//*[@data-label='Country']")
	public static WebElement country ;
	
	public signup_text_fields(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void text_inputs(int rowno) throws IOException
	{
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertext(lastname, excelutils.getcellstring(rowno, 3, "data"), driver, "Last Name");
		entertextusingjs(email, driver, excelutils.getcellstring(rowno, 5, "data"), "Email");
		click(gender, driver, "Gender");
		entertextusingjs(password, driver, excelutils.getcellstring(rowno, 1, "data"), "Password");
		selectbyinvisibletext(driver, month, excelutils.getcellstring(rowno, 10, "data"), "Month");
		entertext(year, excelutils.getcellstring(rowno, 11, "data"), driver, "Year");
		click(date, driver, "Date");
		entertext(nationality, excelutils.getcellstring(rowno, 12, "data"), driver, "Nationality");
		entertext(phonenumber, excelutils.getcellstring(rowno, 6, "data"), driver, "Phone NUmber");
		
	}
}
