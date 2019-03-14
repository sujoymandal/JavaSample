package JavaProgram7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentSerialized implements Serializable{
	
	String name;
	int id;
	transient int marks;
	transient final String grade="A";
	StudentSerialized(String name,int id,int marks){
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
}

public class TransientVariableDemo1 {

	public static void main(String[] args) throws Exception {

		StudentSerialized s1=new StudentSerialized("abc",1,90);
		
		String file="TransientVariableDemo1.txt";
		FileOutputStream fio=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fio);
		os.writeObject(s1);
		System.out.println("done");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream is=new ObjectInputStream(fis);
		
		StudentSerialized s2=(StudentSerialized) is.readObject();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(s2.grade);
	}

}
