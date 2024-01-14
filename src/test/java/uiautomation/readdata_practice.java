package uiautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdata_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\automation\\\\config\\\\property.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String name=prop.getProperty("name");
		System.out.println("the name is :"+ name);
	}

}
