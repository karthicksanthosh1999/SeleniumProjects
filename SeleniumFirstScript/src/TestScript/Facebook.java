package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//							Q.2 Enter email and password and click login(by using xpath locator).
					
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthick.santhosh1999@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("23121999");
		
		WebElement btn = driver.findElement(By.xpath("//Button[@value='1']"));
		btn.click();
		
	}

}
