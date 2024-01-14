package pages.amazon;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class account_create extends Common{
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(id="ap_customer_name")
	public static WebElement firstname ;
	
	@FindBy(id="ap_email")
	public static WebElement phonenumber ;
	
	@FindBy(id="ap_phone_number")
	public static WebElement email ;
	
	@FindBy(id="ap_password")
	public static WebElement password ;
	
	public account_create(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void giving_data(int rowno) throws IOException {
		entertext(firstname, excelutils.getcellstring(rowno, 2, "data"), driver, "First Name");
		entertext(phonenumber, excelutils.getcellstring(rowno, 6, "data"), driver, "Mobile Number");
		entertext(email, excelutils.getcellstring(rowno, 5, "data"), driver, "Email");
		entertext(password, excelutils.getcellstring(rowno, 1, "data"), driver, "Password");
	}
}
