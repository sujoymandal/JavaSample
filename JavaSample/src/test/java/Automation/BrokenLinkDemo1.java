package Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links :"+links.size());
		
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		for(WebElement w:links){
//			if(links.get(i).getAttribute("href")!=null)
//				activeLinks.add(links.get(i));
//			}
			
			String s=w.getAttribute("href");
		System.out.println(s);
		//System.out.println("Active links "+activeLinks.size());
		
		}
	}
		

	}


