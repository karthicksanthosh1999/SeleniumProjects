package TestScript;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sanapdeal {


	public static void main(String[] args) throws AWTException, InterruptedException {

//		12Q.Click signin and click new register and enter mobile number abd click continue.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.get("https://www.snapdeal.com/");
//
//		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
//		
//		Actions builder = new Actions(driver);
//		builder.moveToElement(signIn).perform();
//		
//		
//
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		driver.quit();
		
		driver.manage().window().maximize();
		driver.get("https://play.letcode.in/aui");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions drag = new Actions(driver);
		drag.dragAndDrop(source, target).perform();
	}
}
		