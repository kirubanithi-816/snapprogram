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

public class WriteExcelMultipleRows {
	
	public static void main(String[] args) throws IOException
	
	{
		
		File floc=new File("C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\TestData\\TestData (1).xlsx");
		
		Workbook wb=new XSSFWorkbook();
		Sheet s=wb.createSheet("Kiruba1");
		
		for (int i = 0; i <=5; i++) {
			
			Row r=s.createRow(i);
		
			for (int j = 0; j <=0; j++) 
				
			Cell c=r.createCell(j);		
				
			if c.setCellValue("Yurvaraj");	
			
			
			
			}	
		
				
		FileOutputStream o= new FileOutputStream(floc);
		wb.write(o);
		
		System.out.println("write");
		
		
	}

}
