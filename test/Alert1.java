package oro.sample.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

public static void main (String[] args) throws InterruptedException

{
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
WebDriver wd=new ChromeDriver();
wd.get("http://demo.automationtesting.in/Alerts.html");

WebElement we1=wd.findElement(By.xpath("//button[@class='btn btn-danger']"));
we1.click();

Thread.sleep(5000);
Alert a = wd.switchTo().alert();
a.accept();


}
	
	

}