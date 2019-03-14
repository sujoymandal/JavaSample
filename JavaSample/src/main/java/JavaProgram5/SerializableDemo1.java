package JavaProgram5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	String name;
	int sal;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setSal(int sal){
		this.sal=sal;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSal(){
		return this.sal;
	}
}

public class SerializableDemo1 {

	public static void main(String[] args) throws Exception {

		
		String file="D:/SerializableDemo1.txt";
		//File f=new File(file);
		Employee e=new Employee();
		e.setName("abc");
		e.setSal(1000);
		
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fio=new FileOutputStream(file);
		ObjectOutputStream wr=new ObjectOutputStream(fio);
		wr.writeObject(e);
		System.out.println("object is written!!");
		ObjectInputStream rd=new ObjectInputStream(fis);
		Employee e1=(Employee) rd.readObject();
		System.out.println(e1.getName());
		System.out.println(e1.getSal());
		
	}

}
