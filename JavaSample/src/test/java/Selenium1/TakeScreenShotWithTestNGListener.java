package Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShotWithTestNGListener extends TestNGListenerDemoMainClass{

	public static String getScreenShot(){
		
		String screenShotPath=System.getProperty("user.dir")+"\\test-output\\screenShot.png";
		File dest=new File(screenShotPath);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println("file not exists!!");
		}
		return screenShotPath;
	}
	
	
}
