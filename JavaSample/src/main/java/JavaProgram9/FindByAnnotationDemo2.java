package JavaProgram9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FindByAnnotationDemo2 extends FindByAnnotationDemo{
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmail;
	
	
	@Test
	public void test(){
		
		initialization();
		//WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		PageFactory.initElements(driver, this);
		gmail.click();
	}

}
