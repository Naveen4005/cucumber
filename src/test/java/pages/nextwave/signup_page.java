package pages.nextwave;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class signup_page extends Common{
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(name="vfb-5")
	public static WebElement firstname ;
	
	@FindBy(name="vfb-7")
	public static WebElement lastname ;
	
	@FindBy(xpath="//input[@value='Male']")
	public static WebElement gender ;
	
	@FindBy(id="vfb-13-address")
	public static WebElement address ;
	
	@FindBy(id="vfb-13-address-2")
	public static WebElement street ;
	
	@FindBy(id="vfb-13-city")
	public static WebElement city;
	
	@FindBy(id="vfb-13-state")
	public static WebElement state;
	
	@FindBy(id="vfb-13-zip")
	public static WebElement zip;
	
	@FindBy(xpath="(//*[@role='combobox'])[1]")
	public static WebElement country;
	
	@FindBy(id="vfb-14")
	public static WebElement email;
	
	public signup_page(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void sign_up(int rowno) throws IOException
	{
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertextusingjs(lastname, driver, excelutils.getcellstring(rowno, 3, "data"), "Last Name");
		click(gender, driver, "Male");
		entertext(address, excelutils.getcellstring(rowno, 12, "data"), driver, "Address");
		entertextusingjs(street, driver, excelutils.getcellstring(rowno, 13, "data"), "Street");
		entertext(city, excelutils.getcellstring(rowno, 14, "data"), driver, "City");
		entertext(state, excelutils.getcellstring(rowno, 15, "data"), driver, "State");
		entertext(zip, excelutils.getcellstring(rowno, 16, "data"), driver, "Zip");
		selectbyinvisibletext(driver, country, excelutils.getcellstring(rowno, 17, "data"), "Country");
		entertextusingjs(email, driver, excelutils.getcellstring(rowno, 5, "data"), "Email");
		
	}
	
	/*public void validateUIText(int rowno) throws IOException
	{
		validateuitext(text, excelutils.getcellstring(rowno, 12, "data"));
	}*/
}
