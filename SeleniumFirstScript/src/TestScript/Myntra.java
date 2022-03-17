package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		
//							13.Q Enter Mobile number and click continue
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement phone = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		phone.sendKeys("8220942384");
		
		WebElement continuebtn = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		continuebtn.click();

	}

}
