package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement Fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Fname.sendKeys("Karthick");

		WebElement Sname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		Sname.sendKeys("santhosh");

		WebElement Adress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		Adress.sendKeys("madurai");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("karthick@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8220942374");

		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();

		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();

		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();

		WebElement english = driver.findElement(By.xpath("//a[text()='English']"));
		english.click();

		WebElement skils = driver.findElement(By.id("Skills"));
		Select dropSkils = new Select(skils);
		dropSkils.selectByValue("AutoCAD");

		WebElement dropcountry = driver.findElement(By.xpath("//span[@tabindex='-1']"));
		dropcountry.click();
		
		WebElement India = driver.findElement(By.xpath("//li[text()='India']"));
		India.click();
		
		WebElement Year = driver.findElement(By.id("yearbox"));
		Select yearSelect = new Select(Year);
		yearSelect.selectByValue("1999");
		
		WebElement month = dropcountry.findElement(By.xpath("//select[@placeholder='Month']"));
		Select monthSelect = new Select(month);
		monthSelect.selectByValue("December");
		
		WebElement day= dropcountry.findElement(By.xpath("//select[@placeholder='Day']"));
		Select daySelect = new Select(day);
		daySelect.selectByValue("23");
		
		WebElement pass = driver.findElement(By.id("firstpassword"));
		pass.sendKeys("AWM");
		
		WebElement cPass = driver.findElement(By.id("secondpassword"));
		cPass.sendKeys("AWM");
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		
		

	}

}
