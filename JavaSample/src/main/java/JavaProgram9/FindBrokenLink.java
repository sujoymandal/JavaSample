package JavaProgram9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://makemysushi.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		links.addAll(images);
		System.out.println(links.size());
		
		
		for(WebElement e:links){
			String url=e.getAttribute("href");
			CheckUrl(url);
		}
		
		driver.close();
	}
	
	public static void CheckUrl(String linkurl){
		
		try {
			URL url=new URL(linkurl);
		
				HttpURLConnection con=(HttpURLConnection) url.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				if(con.getResponseCode()==200){
					System.out.println(linkurl+"--->"+con.getResponseMessage());
				}
				if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
					System.out.println(linkurl+"--->"+con.getResponseMessage());
				}
						
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
