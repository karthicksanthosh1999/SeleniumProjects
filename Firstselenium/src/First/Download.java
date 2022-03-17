package First;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ks612\\eclipse-workspace\\Firstselenium\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement downloadfile = driver.findElement(By.linkText("Download Excel"));
		downloadfile.click();
		
		File fileloocation =  new File("C:\\Users\\ks612\\Downloads");
		
		File[] totaFiles = fileloocation.listFiles();
		
		for(File file : totaFiles) {
			if (file.getName().equals("testleaf.Xlsx")) {
				System.out.println("file download successfully");
				break;
				
			}
		}
	}

}
