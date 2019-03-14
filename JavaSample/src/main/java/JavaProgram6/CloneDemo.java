package JavaProgram6;

class Course{
	String subject1;
	String subject2;
	
	Course(String s1,String s2){
		this.subject1=s1;
		this.subject2=s2;
	}
}


class Student implements Cloneable{
	
	String name;
	int id;
	Course c;
	Student(String name,int id,Course c){
		this.name=name;
		this.id=id;
		this.c=c;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
public class CloneDemo {

	public static void main(String[] args) {

		Course course=new Course("math","chem");
		Student s1=new Student("abc",1,course);
		
		System.out.println(s1.c.subject1);
		Student s2=null;
		try {
			s2=(Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		s2.c.subject1="eng";
		System.out.println(s1.c.subject1);
		System.out.println(s2.c.subject1);
	}

}
