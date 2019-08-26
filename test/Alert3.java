package oro.sample.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		Thread.sleep(2000);
		WebElement WE=wd.findElement(By.xpath("//input[@class='btn btn-default']"));
		WE.click();
		
		Thread.sleep(2000);
		Alert a=wd.switchTo().alert();
		a.accept();
		
		
	}
	
}
