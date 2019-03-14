package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextBoxText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sujoymandal33");
		String val=driver.findElement(By.id("identifierId")).getAttribute("value");
		System.out.println(val);
		driver.quit();
	}

}
