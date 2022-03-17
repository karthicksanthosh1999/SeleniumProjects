package First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.PathWatcher.DirAction;

public class WindowsHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\Selenium2\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//							handle the two windows

		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");

		String oldwindow = driver.getWindowHandle();
		WebElement firstwindow = driver.findElement(By.id("home"));
		firstwindow.click();

		Set<String> handle = driver.getWindowHandles();

		for (String newwindow : handle) {
			driver.switchTo().window(newwindow);

		}
		
		
//						count the no of windows
		WebElement editbox = driver.findElement(By.id("wrapper"));
		editbox.click();

		driver.close();
		driver.switchTo().window(oldwindow);
		
		
		WebElement openmultiple = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		openmultiple.click();
		
		int numberofwindows =driver.getWindowHandles().size();
		System.out.println("Number of windows = "+numberofwindows);
		
		
//							only parant windows
		
		WebElement btn = driver.findElement(By.id("color"));
		String color =btn.getCssValue("btn color= ");
		System.out.println(color);
		
		WebElement dontcloseme = driver.findElement(By.id("color"));
		dontcloseme.click();
		
		Set<String> newwindowsHandles =driver.getWindowHandles();
		for (String allwidows : newwindowsHandles) {
			if (! allwidows.equals(oldwindow)) {
				driver.switchTo().window(allwidows);
				driver.close();
			}
			
		}
		
		

	}
	
	

}
