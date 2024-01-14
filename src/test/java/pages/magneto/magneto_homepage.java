package pages.magneto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class magneto_homepage extends Common {
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	public static WebElement createaccount ;
	
	public magneto_homepage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateaccount()
	{
		click(createaccount, driver, "Create Account");
	}
}
