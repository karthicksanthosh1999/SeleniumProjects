package First;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csscolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ks612\\eclipse-workspace\\Firstselenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement ele = driver.findElement(By.id("position"));
		org.openqa.selenium.Point point = ele.getLocation();
		
		int X = ((org.openqa.selenium.Point) ele).getX();
		int Y = ((org.openqa.selenium.Point) ele).getY();
		
		System.out.println("X= "+ X +" y= "+Y);

	}

}
