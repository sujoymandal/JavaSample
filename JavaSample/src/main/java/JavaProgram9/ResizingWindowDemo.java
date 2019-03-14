package JavaProgram9;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizingWindowDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension d=new Dimension(200, 200);
		driver.manage().deleteAllCookies();
		driver.manage().window().setSize(d);
		
	}

}
