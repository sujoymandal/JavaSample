package JavaProgram9;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlInNewTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String window=driver.getWindowHandle();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open()");
		Set<String> windows=driver.getWindowHandles();
		for(String s:windows){
			if(!driver.switchTo().window(s).getCurrentUrl().equals("https://www.google.com/")){
				driver.switchTo().window(s);
				driver.navigate().to("https://www.geeksforgeeks.org/");
			}
		}
		driver.switchTo().window(window);
		driver.close();
	}

}
