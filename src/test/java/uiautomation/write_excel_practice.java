package uiautomation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class write_excel_practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		XSSFCell cell1=row1.getCell(0);
		cell.setCellValue("gw0");
		cell1.setCellValue("su0");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		wb.write(fos);
		fos.close();
	}

}
