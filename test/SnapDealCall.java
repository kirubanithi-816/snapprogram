package oro.sample.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealCall extends SanapDealExcelInte {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.snapdeal.com/");
		wd.manage().window().maximize();
		WebElement searchkeyword=wd.findElement(By.xpath("//input[@id='inputValEnter']"));
		searchkeyword.sendKeys(getData(0,0));
		WebElement searchbtn=wd.findElement(By.xpath("//button[contains(@class,'searchformButton')]"));
		searchbtn.click();
//		WebElement scrollup=wd.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
//		WebElement scrolldown=wd.findElement(By.xpath("(//span[contains(text(),'Featured')])[2]"));
//		JavascriptExecutor jk=(JavascriptExecutor)wd;
//		jk.executeScript("argument[0].scrollIntoView(true)",scrollup);
//		jk.executeScript("argument[1].scrollIntoView(false)",scrollup,scrolldown);
		
		WebElement prod=wd.findElement(By.xpath("(//img[@title='Puma Sneakers White Casual Shoes'])[1]"));
		prod.click();
		//WebElement buy=wd.findElement(By.xpath("//div[@id='buy-button-id']"));
		//buy.click();
		WebElement mobile=wd.findElement(By.xpath("//input[@id='username']"));
		searchkeyword.sendKeys(getData(1,0));
		WebElement cont=wd.findElement(By.xpath("//button[@id='login-continue']"));
		cont.click();
		WebElement newemail=wd.findElement(By.xpath("//input[@id='new-email']"));
		newemail.sendKeys(getData(2,0));
		WebElement newname=wd.findElement(By.xpath("//input[@id='j_name']"));
		newname.sendKeys(getData(3,0));
		WebElement pw=wd.findElement(By.xpath("//input[@id='w_password']"));
		pw.sendKeys(getData(4,0));
//		WebElement cont1=wd.findElement(By.xpath("//button[@id='login-continue']"));
	//	cont1.click();
				
}
	
}
