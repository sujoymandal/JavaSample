package JavaProgram8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {

	@Test(dataProvider="provider")
	public void dataGetter(String name,String pwd){
		System.out.println(name+" and "+pwd);
	}
	
	@DataProvider(name="provider")
	public Object[][] dataProviderMethod(){
		
		return new Object[][]{{"abc","xyz"},{"fgh","uyt"}
			
		};
		
	}
}
