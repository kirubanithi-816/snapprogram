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

public class DataDrivenEx1 {
	
	public static void main(String[] args) throws IOException
	{
		
		File f= new File("C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\TestData\\TestData (1).xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(stream);
		
		Sheet s= w.getSheet("Exc2");
		
		Row r=s.getRow(1);
		
		int rcount=s.getPhysicalNumberOfRows();
		System.out.println("Number of rows"+"\n" +rcount);
		
		
		Cell c= r.getCell(1);
	    int rcol =r.getPhysicalNumberOfCells();
	    System.out.println("Number of Col"+"\n" +rcol);
		
	
		}
	}
