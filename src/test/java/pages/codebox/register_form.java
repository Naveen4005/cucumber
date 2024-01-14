package pages.codebox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class register_form extends Common{
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(id="firstName")
	public static WebElement firstname ;
	
	@FindBy(id="lastName")
	public static WebElement lastname ;
	
	@FindBy(id="userEmail")
	public static WebElement email ;
	
	@FindBy(id="gender-radio-1")
	public static WebElement gender ;
	
	@FindBy(id="userNumber")
	public static WebElement Mobilenumber ;
	
	@FindBy(xpath="(((//*[@class='react-datepicker__month-container']/div)[1]/div)[2]/div)[1]/select")
	public static WebElement month ;
	
	
	@FindBy(xpath="(((//*[@class='react-datepicker__month-container']/div)[1]/div)[2]/div)[2]/select")
	public static WebElement year ;
	
	@FindBy(xpath="((//*[@class='react-datepicker__week'])[3]/div)[3]")
	public static WebElement date ;
	
	@FindBy(xpath="//*[@id=\"subjectsContainer\"]/div/div[1]")
	public static WebElement subjects ;
	
	@FindBy(xpath="//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
	public static WebElement hobbies ;
	
	public register_form(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	public void signup_page(int rowno) throws IOException
	{
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertext(lastname, excelutils.getcellstring(rowno, 3, "data"), driver, "Last Name");
		entertextusingjs(email, driver, excelutils.getcellstring(rowno, 5, "data"), "Email");
		click(gender, driver, "Gender");
		entertextusingjs(Mobilenumber, driver, excelutils.getcellstring(rowno, 6, "data"), "Mobile Number");
		selectbyinvisibletext(driver, month, excelutils.getcellstring(rowno, 10, "data"), "Month");
		selectbyinvisibletext(driver, year, excelutils.getcellstring(rowno, 11, "data"), "Year");
		selectbyinvisibletext(driver, date, excelutils.getcellstring(rowno, 9, "data"), "Date");
		entertext(subjects, excelutils.getcellstring(rowno, 12, "data"), driver, "Subjects");
		click(hobbies, driver, "Hobbies");
	}
}
