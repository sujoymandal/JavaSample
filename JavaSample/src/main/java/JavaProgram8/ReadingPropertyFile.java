package JavaProgram8;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				"\\src\\main\\java\\SampleFiles\\Property1.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("roll"));
		System.out.println(prop.getProperty("marks"));
		System.out.println(prop.keySet());
		
	}

}
