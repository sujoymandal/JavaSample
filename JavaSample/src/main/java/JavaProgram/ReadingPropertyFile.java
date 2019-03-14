package JavaProgram;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws Exception {

		String path=System.getProperty("user.dir")+"\\src\\main\\java\\SampleFiles\\Property1.properties";
		FileInputStream  fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		for(Object key:prop.keySet())
			System.out.println(prop.getProperty(key.toString()));
	}

}
