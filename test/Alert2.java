package oro.sample.test;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdirver.chrome.driver", "C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
WebDriver WebDr=new ChromeDriver();
		WebDr.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		Thread.sleep(2000);
		
		WebElement btn=WebDr.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		btn.click();
		
		
		}

}
