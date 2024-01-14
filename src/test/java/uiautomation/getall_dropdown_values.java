package uiautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getall_dropdown_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	    WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(drp);
		sel.selectByIndex(189);
		boolean flag=false;
	  
		List<WebElement> drpvalues=sel.getOptions();
		for(WebElement drpval:drpvalues)
		{
			if(!drpval.getText().equals("INDIAN"))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Indian option not available in dropdown");
		}
		String str=sel.getFirstSelectedOption().getText();
		System.out.println(str);
		
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Naveen");
		String enteredtext=firstname.getAttribute("value");
		System.out.println("Entered text is : "+enteredtext);

	}

}
