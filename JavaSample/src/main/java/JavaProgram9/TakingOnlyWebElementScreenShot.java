package JavaProgram9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingOnlyWebElementScreenShot {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		
		WebElement el=driver.findElement(By.id("post-152831"));
		File src=el.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:/12_03_element.png"));
		
	}

}
