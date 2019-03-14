package Selenium2;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethodDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Actions act=new Actions(driver);
		String baseWindow=driver.getCurrentUrl();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open()");
		
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows){
			if(!driver.switchTo().window(window).getCurrentUrl().equals(baseWindow))
				driver.navigate().to("https://www.gmail.com/");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
