package First;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\Selenium2\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement btn = driver.findElement(By.id("color"));
		String color = btn.getCssValue("background-color");
		System.out.println(color);
		
		 WebElement Gmail = driver.findElement(By.id("position")); 
		  
		     int getX = Gmail.getLocation().getX();
		     System.out.println("Xcoordinate : "+getX);
		     int getY = Gmail.getLocation().getY(); 
		     System.out.println("Ycoordinate: "+getY);
		     
		 	Rectangle size = driver.findElement(By.id("size")).getRect();
		 	
		 	System.out.println("Height= "+size.getHeight());
		 	System.out.println("width= "+size.getWidth());
		 	
		 	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
