package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckBrowserQuitOrNot {

	public static WebDriver driver; 
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		driver.quit();
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		
		}
	}


