package pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class signuppage extends Common{
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")
	public static WebElement clickonbutton ;
	
	@FindBy(id="createAccountSubmit")
	public static WebElement createbutton ;
	
	
	
	public signuppage(WebDriver rdriver) {
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	public void clickcreateaccount() {
		click(clickonbutton, driver, "Clicks on Signup");
		click(createbutton, driver, "Create Button");
	}
}
