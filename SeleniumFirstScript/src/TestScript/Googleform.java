package TestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleform {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Robot robot = new Robot();
		
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement fName = driver.findElement(By.id("firstName"));
		fName.sendKeys("karthick");
		
		WebElement sName = driver.findElement(By.id("lastName"));
		sName.sendKeys("santhosh");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("karthick822094");
		robot.keyPress(KeyEvent.VK_ENTER);
				
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
      	pass.sendKeys("karthick");
		
      	WebElement cpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
      	cpass.sendKeys("karthick");
		
		WebElement check = driver.findElement(By.id("i3"));
		check.click();
		
		WebElement ok = driver.findElement(By.xpath("//span[text()='Next']"));
		ok.click();
		
		
		

	}

}
