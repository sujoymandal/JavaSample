package Selenium1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeGetTextMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement el=driver.findElement(By.xpath("//*[text()='Sign in']"));
		System.out.println(el.getAttribute("id"));
		System.out.println(el.getAttribute("href"));
		System.out.println(el.getAttribute("name"));//null
		System.out.println(el.getText());
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.toString());
		System.out.println(cookies.size());
		for(Cookie c:cookies){
			System.out.println(c.getName());
		}
		driver.quit();
	}

}
