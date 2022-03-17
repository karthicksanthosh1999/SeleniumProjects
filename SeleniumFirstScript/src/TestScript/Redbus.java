package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/bus-tickets/ernakulam-to-madurai?fromCityName=Kochi&fromCityId=216&toCityName=Madurai&toCityId=126&onward=12-Mar-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
		driver.manage().window().maximize();	
		
		Thread.sleep(3000);
		WebElement bus = driver.findElement(By.xpath("//div[text()='View Buses']"));
		bus.click();
		
		WebElement hide = driver.findElement(By.xpath("//div[text()=='Hide Buses']"));
		hide.click();
		
		WebElement xbtn = driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']"));
		xbtn.click();
		
		WebElement seat = driver.findElement(By.xpath("//*[@id=\'19810794\']/div/div[2]/div[1]"));
		seat.click();

	}

}
