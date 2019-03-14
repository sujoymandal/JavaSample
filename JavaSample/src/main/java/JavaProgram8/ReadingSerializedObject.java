package JavaProgram8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadingSerializedObject {

	public static void main(String[] args) throws Exception {

		FileInputStream fis=new FileInputStream("D:/SerializationDemo_04_03.txt");
		
		ObjectInputStream is=new ObjectInputStream(fis);
		
		SerializedClass1 obj=(SerializedClass1) is.readObject();
		
		System.out.println(obj.getName());
	}

}
