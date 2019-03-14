package Selenium1;

import org.testng.annotations.Test;

public class UsingDriverInstanceFromAnotherClass extends SharingDriverInstanceBetweenMethods{
	
	
	@Test
	public void start(){
	
		method1();
		driver.close();
	}

}
