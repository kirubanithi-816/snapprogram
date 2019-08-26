package oro.sample.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SanapDealExcelInte {

	public static String getData(int rowno, int colno) throws IOException
	{
		
		File f=new File("C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\TestData\\SnapDeal.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(stream);
		
		Sheet s=wb.getSheet("SD");
		
		Row r=s.getRow(rowno);
		Cell c=r.getCell(colno);
		
	int ctype=c.getCellType();
	String name="";
	
	if(ctype==1) 
	{
		
	name=c.getStringCellValue();
	System.out.println(name);
	}
		
	else
	{
		double db = c.getNumericCellValue();
		long l=(long)db;
		
		name=String.valueOf(1);
		System.out.println(name);
		}
	
	return name;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		getData(0,0);
	}
	
	
	
}
