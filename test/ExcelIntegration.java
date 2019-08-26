package oro.sample.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {
	
	public static String getData(int rowno, int colnoo) throws IOException
	
	{
		
	File f = new File("C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\TestData\\Untitled spreadsheet.xlsx");
	
	FileInputStream stream=new FileInputStream(f);
	
	Workbook book=new XSSFWorkbook(stream);
	
	Sheet s = book.getSheet("Data");
	
	Row r = s.getRow(rowno);
	Cell c = r.getCell(colnoo);
	
int ctype = c.getCellType();
String name="";

if (ctype==1)
	
{
name=c.getStringCellValue();
System.out.println(name);
	
}

else if(ctype==0)
{
	if (DateUtil.isCellDateFormatted(c))
	{
		Date d = c.getDateCellValue();
		
		SimpleDateFormat SD = new SimpleDateFormat("dd-yyyy-MMM");
		name = SD.format(d);
		System.out.println(name);
				
	}
	else
	{
		double db = c.getNumericCellValue();
		long l=(long)db;
		
		name=String.valueOf(1);
		System.out.println(name);
		
	}
	
}
	
	return name;
	}
	
	public static void main(String[] args) throws IOException {
		
		
		getData(2,10);
	}	
	
	

}
