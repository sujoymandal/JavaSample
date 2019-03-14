package JavaProgram2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws Exception {

		try {
			FileReader file=new FileReader("D:/FileReadDemo.txt");
			BufferedReader read=new BufferedReader(file);
			for(int i=0;i<3;i++){
				System.out.println(read.readLine());
				//read.close();
			}
			read.close();
		} catch (FileNotFoundException e) {
			
			//System.out.println(e.getMessage());
			System.out.println("file not present!!");
		}
		
		
	}

}
