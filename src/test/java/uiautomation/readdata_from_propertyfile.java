package uiautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdata_from_propertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\config\\property.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String username=prop.getProperty("username");
		System.out.println("username from property file fetched as :"+username);

	}

}
