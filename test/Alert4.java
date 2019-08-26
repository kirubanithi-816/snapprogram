package oro.sample.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);
		WebElement we=wd.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		we.click();
		
		Thread.sleep(2000);
		Alert a=wd.switchTo().alert();
		a.accept();

		 
		
		Thread.sleep(2000);
			WebElement we2=wd.findElement(By.xpath("//a[text()='click the button to demonstrate the prompt box'"));
		Thread.sleep(2000);
		we2.click();
		
//		Thread.sleep(2000);
//		WebElement we1 = wd.findElement(By.xpath("//a[@href='#Textbox']"));
//		we1.sendKeys("Text box typing....");
		
		
		
				
	}

}
