package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.PathWatcher.DirAction;

public class Iphone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//												Q.1 Click start here. Enter iphone and search
		
		driver.get(" https://www.amazon.in/");
	
		WebElement Iphone = driver.findElement(By.id("twotabsearchtextbox"));
		Iphone.sendKeys("Iphone"+Keys.ENTER);
	}
	

}
