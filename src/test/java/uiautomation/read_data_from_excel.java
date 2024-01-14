package uiautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data_from_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		// .xlsx -> XSSFWorkbook ; .xls -> HSSFWorkbook
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");   // or XSSFSheet sheet=wb.getSheetAt(0)
		
		int lasrownum=sheet.getLastRowNum();
		
		int firstrownum=sheet.getFirstRowNum();
		
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
		     int colno=row.getLastCellNum();
		     
		     for(int j=0;j<colno;j++)
		     {
		    	 XSSFCell cell=row.getCell(j);
		    	 String val=cell.getStringCellValue();
		    	 System.out.println(val);
		     }
		}
		

	}

}
