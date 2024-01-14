package pages.bootstrap.app;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class RegistrationPage_BA extends Common {
	
WebDriver driver;
ExcelUtils excelutil=new ExcelUtils();

	
	@FindBy(xpath="//input[@name='first_name']")
	public static WebElement firstname ;
	
	@FindBy(name="last_name")
	public static WebElement lastname ;
	
	@FindBy(xpath="//input[@value='Male']")
	public static WebElement male ;
	
	@FindBy(id="exampleFormControlSelect2")
	public static WebElement hobbie ;
	
	@FindBy(xpath="//select[@name='department']")
	public static WebElement office ;
	
	@FindBy(name="user_name")
	public static WebElement username ;
	
	
	@FindBy(xpath="//input[@name='contact_no']")
	public static WebElement phone ;
	
	@FindBy(xpath="//input[@name='user_password']")
	public static WebElement password ;
	
	@FindBy(xpath="//select[@name='department']")
	public static WebElement department ;
	
	@FindBy(xpath="//input[@name='confirm_password']")
	public static WebElement confirm;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement mail ;
	
	@FindBy(id="exampleFormControlTextarea1")
	public static WebElement adi ;
	

	
	

	public RegistrationPage_BA(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void createregistration(int rowno) throws AWTException, InterruptedException, IOException
	{
		entertextusingjs(firstname, driver,excelutil.getcellstring(rowno, 2, "data"),"FirstName");
		entertext(lastname, excelutil.getcellstring(rowno, 3, "data"),driver,"lastname");
		click(male,driver,"Male Radio Button");
		selectbyinvisibletext(driver, hobbie, excelutil.getcellstring(rowno, 4, "data"),"Hobbie");
		selectbyindex(driver, office, 3,"Office");
		entertextusingjs(username, driver,excelutil.getcellstring(rowno, 0, "data"),"UserName");
		entertextusingjs(password, driver, excelutil.getcellstring(rowno, 1, "data"),"Password");
		entertextusingjs(mail, driver, excelutil.getcellstring(rowno, 5, "data"),"Email");
		entertextusingjs(phone, driver, excelutil.getcellstring(rowno, 6, "data"),"Phone");
		Thread.sleep(7000);
		copydatausingrobotclass();
		
		
	}
}
