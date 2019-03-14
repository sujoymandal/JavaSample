package JavaProgram2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFileDemo {

	public static void main(String[] args) throws Exception {

		String src="D:/source/source.txt";
		String dest="D:/destination/dest.txt";
		
		File f1=new File(src);
		File f2=new File(dest);
		FileUtils.copyFile(f1, f2);
		System.out.println("done!!!");
		
		
	}

}
