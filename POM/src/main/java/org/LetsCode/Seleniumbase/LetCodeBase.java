package org.LetsCode.Seleniumbase;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LetCodeBase {
	protected RemoteWebDriver driver = null;
	String URL = "https://opensource-demo.orangehrmlive.com/";

	@BeforeMethod
	public void StartApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(URL);
	}

	@AfterMethod
	public void CloseApp() {
		driver.quit();

	}

}
