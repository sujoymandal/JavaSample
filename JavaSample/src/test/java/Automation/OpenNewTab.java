package Automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//driver.findElement(By.tagName("body")).sendKeys(Keys.LEFT_CONTROL+"t");;
//		driver.get("https://www.google.com/");
		//System.out.println(el.getText());

		Thread.sleep(3000);
	   //Actions act=new Actions(driver);
	   //act.keyDown(Keys.CONTROL).sendKeys("\t").keyUp(Keys.CONTROL).build().perform();
	   //driver.get("https://www.google.com/");
		//act.sendKeys(Keys.CONTROL+"t").build().perform();
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_T);
         
         driver.get("https://www.google.com/");

}
}
