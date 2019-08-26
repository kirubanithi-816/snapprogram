package oro.sample.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelCall extends ExcelIntegration {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KiruSugu\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://demo.automationtesting.in/Register.html");
		
	WebElement firstname = wd.findElement(By.xpath("//input[@ng-model='FirstName']"));
	firstname.sendKeys(getData(1,0));
		
	WebElement lastname = wd.findElement(By.xpath("//input[@ng-model='LastName']"));
	lastname.sendKeys(getData(1,1));
	
	WebElement address = wd.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys(getData(1,2));
	
	WebElement email = wd.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	email.sendKeys(getData(1,3));
	

	}
}
