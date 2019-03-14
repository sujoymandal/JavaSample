package JavaProgram9;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPageUsingActionClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

}
