package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {

	public static void main(String[] args) {
		
//							Q10. Click any  product and click search
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
			
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone"+Keys.ENTER);
		
		
		
		

	}

}
