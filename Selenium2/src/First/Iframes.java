package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\Selenium2\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//							handle the two windows

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.id("Click")).getText();
		text.click();

		System.out.println(text);
		driver.switchTo().defaultContent();

	}

}
