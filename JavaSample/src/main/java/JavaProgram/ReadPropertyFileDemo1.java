package JavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFileDemo1 {

	public static void main(String[] args) throws Exception {

		Properties prop=new Properties();	
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\SampleFiles\\Property2.prop";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("add"));
		System.out.println(prop.keySet());
	}

}
