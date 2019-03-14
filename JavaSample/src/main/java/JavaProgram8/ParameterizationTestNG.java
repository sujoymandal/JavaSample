package JavaProgram8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestNG {

	@Test
	@Parameters({"user","pwd"})
	public void test1(String user,String pwd){
		System.out.println("test1!!");
		System.out.println(user+" and "+pwd);
	}
	
}
