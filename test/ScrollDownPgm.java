package oro.sample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownPgm {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.toolsqa.com/");
	
	WebElement sc1=wd.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
	
	JavascriptExecutor jk=(JavascriptExecutor)wd;
	jk.executeScript("argument[1].scrollIntoView(true)", "Benefit");

	
}

}
