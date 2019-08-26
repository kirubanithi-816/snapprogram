package oro.sample.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exc3ExcelWrite {
	
	public static void main(String[] args) throws IOException
	
	{
		
		File floc=new File("C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\TestData\\TestData (1).xlsx");
		
		Workbook wb=new XSSFWorkbook();
		Sheet s=wb.createSheet("Kiruba");
		
				
		Row r=s.createRow(1);
		
		Cell c=r.createCell(0);
		
		c.setCellValue("Yurvaraj");
				
		FileOutputStream o= new FileOutputStream(floc);
		wb.write(o);
		
		System.out.println("write");
		
		
	}

}
