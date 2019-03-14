package Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotWithoutDownCasting {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		/*
		 * taking screen shot
		 */
		
		File dest=new File(System.getProperty("user.dir")+"/Selenium1/screenshot.png");
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);
		driver.quit();
	}

}
