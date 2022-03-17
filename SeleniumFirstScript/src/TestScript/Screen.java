package TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ks612\\eclipse-workspace\\SeleniumFirstScript\\driver'\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File img = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("E:\\NewMaven.Software testing recording guidelines\\Wallpapers.png");
	FileUtils.copyFile(img, f);
	
}
}
