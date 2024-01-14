package pages.nextwave;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class homepage extends Common {
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="(//*[text()='Demo Sites'])[2]")
	public static WebElement option1 ;
	
	@FindBy(xpath="(//*[text()='Practice Automation'])[2]")
	public static WebElement option2 ;
	
	@FindBy(xpath="((//*[text()='Practice Automation'])[2]/following-sibling::ul/li)[1]")
	public static WebElement createaccount ;
	
	public homepage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateaccount()
	{
		click(option1, driver, "Clicks on DemoSite");
		click(option2, driver, "Clicks on practice");
		click(createaccount, driver, "Create Account");
	}
}
