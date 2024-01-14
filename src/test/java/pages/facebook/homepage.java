package pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class homepage extends Common{
	
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="//*[@data-testid=\"open-registration-form-button\"]")
	public static WebElement createaccount ;
	
	public homepage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateaccount()
	{
		click(createaccount, driver, "Create Account");
	}
}
