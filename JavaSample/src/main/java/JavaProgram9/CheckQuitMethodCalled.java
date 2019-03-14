package JavaProgram9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckQuitMethodCalled {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println(((RemoteWebDriver)driver).getSessionId());//will return value
		System.out.println(driver.toString());
		driver.quit();
		System.out.println(((RemoteWebDriver)driver).getSessionId());//will return null
		System.out.println(driver.toString());

	}

}
