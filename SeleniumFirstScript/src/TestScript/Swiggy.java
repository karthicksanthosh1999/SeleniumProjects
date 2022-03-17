package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		
		
		
//								Q.14 Click sign up and Give details and register the form.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
		WebElement signup = driver.findElement(By.xpath("//a[@class= 'r2iyh']"));
		signup.click();
		
		WebElement phone = driver.findElement(By.id("mobile"));
		phone.sendKeys("8220942384");
		
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("karthick.S");
		
		WebElement eMail = driver.findElement(By.id("email"));
		eMail.sendKeys("karthick@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("karthick");
		
		WebElement btn = driver.findElement(By.xpath("//a[@class= 'a-ayg']"));
		btn.click();
		
		

	}

}
