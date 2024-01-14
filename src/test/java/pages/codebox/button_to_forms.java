package pages.codebox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;
import excelutilities.ExcelUtils;

public class button_to_forms extends Common{
	WebDriver driver;
	ExcelUtils excelutils=new ExcelUtils();
	
	@FindBy(xpath="//*[@baseProfile='tiny']")
	public static WebElement formsbutton ;
	
	@FindBy(xpath="(//*[@id=\"item-0\"]/span)[2]")
	public static WebElement registerbutton ;
	
	public button_to_forms(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void towards_register()
	{
		click(formsbutton, driver, "Forms Button");
		click(registerbutton, driver, "Register Button");
	}
}
