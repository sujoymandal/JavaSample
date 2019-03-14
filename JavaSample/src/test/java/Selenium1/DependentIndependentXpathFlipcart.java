package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpathFlipcart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=samsung+j7&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_2_10&otracker1=AS_Query_OrganicAutoSuggest_2_10&as-pos=2&as-type=RECENT&as-searchtext=sumsung%20j7");
		WebElement e=driver.findElement(By.xpath("//*[text()='Samsung Galaxy J7 Prime 2 (Gold, 32 GB)']/../../div[2]/div[1]"));
		System.out.println(e.getText());
	}

}
