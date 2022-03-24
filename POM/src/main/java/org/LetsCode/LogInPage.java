package org.LetsCode;

import java.sql.Driver;

import javax.xml.xpath.XPath;

import org.LetsCode.Seleniumbase.LetCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LogInPage extends LetCodeBase {
	
	public LogInPage(RemoteWebDriver driverRemoteWebDriver) {
		this.driver = driver;
		
	}

	// Locators

	public boolean getUserName() {
		return driver.findElement(By.xpath("//input[@id='txtUsername']")).isDisplayed();
	}

	public boolean getPassWork() {
		return driver.findElement(By.xpath("//input[@id='txtPassword']")).isDisplayed();
	}

	public boolean clickLogin() {
		return driver.findElement(By.xpath("//input[@id='btnLogin']")).isDisplayed();
	}

	// Actions
	/**
	 * 
	 * @param username
	 * @return
	 */

	public LogInPage enterUserName(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		return this;
	}

	public LogInPage enterPassWord(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		return this;
	}

	public dashboard ClickButton() {
		driver.findElement(By.id("btnLogin")).click();
		return new dashboard();
	}

	/**
	 * @Description : When not test the login page
	 * @param username
	 * @param pass
	 */

	public void login(String username, String pass) {
		enterUserName(username);
		enterPassWord(pass);
		ClickButton();

	}

}
