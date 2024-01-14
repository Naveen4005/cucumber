package excelutilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	public String getcelldatanumeric(int rowno,int colno,String sheetname) throws IOException
	{

		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		// .xlsx -> XSSFWorkbook ; .xls -> HSSFWorkbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);   // or XSSFSheet sheet=wb.getSheetAt(0)
		XSSFRow row=sheet.getRow(rowno);
		XSSFCell cell=row.getCell(colno);
		double val=0;
		switch(cell.getCellType())
		{
		case Cell.CELL_TYPE_NUMERIC: {
			System.out.print(cell.getNumericCellValue() + "\t");
			val=cell.getNumericCellValue();
			break;
		}

		}
		String val1=String.valueOf(val);
		return val1;

	}

	public String getcellstring(int rowno,int colno,String sheetname) throws IOException
	{

		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		// .xlsx -> XSSFWorkbook ; .xls -> HSSFWorkbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);   // or XSSFSheet sheet=wb.getSheetAt(0)
		XSSFRow row=sheet.getRow(rowno);
		XSSFCell cell=row.getCell(colno);
		String val=cell.getStringCellValue();
		return val;

	}

	public int getrownumber(String sheetname,String tc) throws IOException
	{

		FileInputStream fis=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\automation\\Testdata\\Testdata.xlsx");
		// .xlsx -> XSSFWorkbook ; .xls -> HSSFWorkbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);   
		int rows=sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
		int rownum=0;
		for(int i=0;i<rows;i++)  //i=2
		{
			XSSFRow row=sheet.getRow(i);
			int colno=row.getLastCellNum(); // j=0,1,2,3
			for(int j=0;j<colno;j++)
			{
				String str=row.getCell(j).getStringCellValue();
				if(row.getCell(j).getStringCellValue().equals(tc))
				{
					rownum=i;
					break;
				}
			}
		}
		return rownum;

	}

}
