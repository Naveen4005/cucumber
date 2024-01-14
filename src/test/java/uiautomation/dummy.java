package uiautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import excelutilities.ExcelUtils;

public class dummy {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createaccbtn=driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
		createaccbtn.click();
		
		Thread.sleep(10000);
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		
		ExcelUtils ex=new ExcelUtils();
		String firstname_data=ex.getcelldatanumeric(1, 0, "data");
		System.out.println(firstname_data);
		firstname.sendKeys(firstname_data);
		



	}

}
