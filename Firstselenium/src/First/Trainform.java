package First;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trainform {
	public static void main(String[] args) throws InterruptedException {

//								Q7.Enter From ,TO  and click search trains
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ks612\\eclipse-workspace\\Firstselenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");

		Thread.sleep(3000);

		WebElement To = driver.findElement(By.id("from_station"));
		To.sendKeys("kochi");
		WebElement From = driver.findElement(By.id("to_station"));
		From.sendKeys("Madurai");

		WebElement dropDown = driver.findElement(By.id("trainClass"));
		Select down = new Select(dropDown);
		down.selectByValue("3E");

		WebElement date = driver.findElement(By.id("dpt_date"));
		date.sendKeys("17-03-22");

		WebElement Adult = driver.findElement(By.id("train_adults"));
		Select ad = new Select(Adult);
		ad.selectByValue("2");

		WebElement children = driver.findElement(By.id("train_children"));
		Select child = new Select(children);
		child.selectByValue("6");

		WebElement seniorMen = driver.findElement(By.id("train_male_seniors"));
		Select men = new Select(seniorMen);
		men.selectByValue("4");

		WebElement seniorWomen = driver.findElement(By.id("train_female_seniors"));
		Select women = new Select(seniorWomen);
		women.selectByValue("2");

		WebElement btn = driver.findElement(By.id("trainFormButton"));
		btn.click();

	}

}
