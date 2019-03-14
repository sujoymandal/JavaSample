package JavaProgram10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverListenerImplementedClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		EventFiringWebDriver eventfire=new EventFiringWebDriver(driver);
		WebDriverEventCapture eventcapture=new WebDriverEventCapture();
		eventfire.register(eventcapture);
		eventfire.get("https://www.google.com/");
		//WebElement el=driver.findElement(By.xpath("//a[text()='Gmail']"));
		WebElement el=eventfire.findElement(By.xpath("//a[text()='Gmail']"));
		el.click();
	}

}
