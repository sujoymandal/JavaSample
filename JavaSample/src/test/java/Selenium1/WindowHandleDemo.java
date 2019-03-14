package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleDemo {

	public static void main(String[] args) throws Exception {

		String baseUrl = "https://www.geeksforgeeks.org/java/";
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		WebElement lang = driver.findElement(By.linkText("Coding Practice"));
		Actions act = new Actions(driver);
		// act.moveToElement(lang).build().perform();
		// WebElement e1=driver.findElement(By.xpath("//a[text()='Java']"));
		// act.contextClick(e1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		act.contextClick(lang).build().perform();
		//Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		// driver.get("http://automate-apps.com/");
		// System.out.println(driver.getTitle());
		// Actions action = new Actions(driver);
		// WebElement element =
		// driver.findElement(By.xpath("//a[text()='Selenium Questions']"));
		// action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		// Set<String> winid = driver.getWindowHandles();
		// Iterator<String> iter = winid.iterator();
		// iter.next();
		// String tab = iter.next();
		// driver.switchTo().window(tab);
		// System.out.println(driver.getTitle());
		// driver.quit();

	}

}
