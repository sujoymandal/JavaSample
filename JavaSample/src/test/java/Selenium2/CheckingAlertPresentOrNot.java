package Selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingAlertPresentOrNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		if(isAlertPresent(driver)){
			Alert alrt=driver.switchTo().alert();
			alrt.accept();
		}
		else
			System.out.println("Alert not present!!");
		
		driver.close();
	}

	public static boolean isAlertPresent(WebDriver driver){
		try {
			Alert alrt=driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
