package uiautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\demo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("test2");
		
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
		
		for(int i=0;i<rows;i++)
		{
			
			XSSFRow row=sheet.getRow(i);
			int colno=row.getLastCellNum();
			for(int j=0;j<colno;j++)
			{
				XSSFCell cell=row.getCell(j);
				String val=cell.getStringCellValue();
				if(val.equals("gw2_test2"))
				{
					System.out.println(val);
				}
			}
		}
		
			
		}
	}


