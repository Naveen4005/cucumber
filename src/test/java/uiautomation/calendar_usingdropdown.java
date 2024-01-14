package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import common.Common;

public class calendar_usingdropdown{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement datepicker=driver.findElement(By.id("third_date_picker"));
		datepicker.click();
		
		Common cmn=new Common();
		
		cmn.selectcalendar("2015", "3", "17",driver);
	}

}
