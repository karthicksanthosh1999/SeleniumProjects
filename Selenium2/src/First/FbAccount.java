package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\Selenium2\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		
		
		
		WebElement link = driver.findElement(By.linkText("Sign up for Facebook"));
		link.click();
			
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("karthick");
		
		WebElement Sname = driver.findElement(By.xpath("//input[@name='lastname']"));  
		Sname.sendKeys("santhosh");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("karthicksanthosh@gamil.com");
		
		WebElement rePass = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		rePass.sendKeys("karthicksanthosh@gamil.com");
		
		WebElement  Pass= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Pass.sendKeys("!nm@k3s");
		
		WebElement dropDownDate = driver.findElement(By.id("day"));
		
		Select select = new Select(dropDownDate);
		select.selectByValue("14");
		
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		
		Thread.sleep(3000);
		
		WebElement signIn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signIn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
