package JavaProgram2;

class ParentClassDemo{
	void parentMethod(){
		System.out.println("its a parent class method!!");
	}
	
	public String childMethod(String s){
		System.out.println("its  child method of parent class!!"+s);
		return s+"hello";
	}
}

class ChildClassDemo extends ParentClassDemo{
	
	public void childMethod(){
		System.out.println("its a child method!!");
	}
}
public class InheritanceDisadvantageDemo {

	public static void main(String[] args) {
		
		ChildClassDemo c=new ChildClassDemo();
		c.childMethod();
		c.parentMethod();
		c.childMethod("sujoy");
		
	}

}
