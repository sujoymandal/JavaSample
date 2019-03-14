package JavaProgram8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedClass1 implements Serializable{
	
	String name;
	
	SerializedClass1(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		SerializedClass1 obj1=new SerializedClass1("abc");
		SerializedClass1 obj2=new SerializedClass1("xyz");
		
		FileOutputStream fio=new FileOutputStream("D:/SerializationDemo_04_03.txt");
		ObjectOutputStream os=new ObjectOutputStream(fio);
		os.writeObject(obj1);
		os.writeObject(obj2);
		System.out.println("Done!!");
		FileInputStream fis=new FileInputStream("D:/SerializationDemo_04_03.txt");
		ObjectInputStream is=new ObjectInputStream(fis);
		
		SerializedClass1 readObj1=(SerializedClass1) is.readObject();
		System.out.println(readObj1.getName());
		SerializedClass1 readObj2=(SerializedClass1) is.readObject();
		System.out.println(readObj2.getName());
	}

}
