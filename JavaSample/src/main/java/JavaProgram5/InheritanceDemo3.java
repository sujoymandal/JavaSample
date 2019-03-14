package JavaProgram5;

import JavaProgram6.InheritanceDemo1;

class ChildClass3 extends InheritanceDemo1{
	
	 public void print(){
		 super.protectedMethod();
	 }
}
public class InheritanceDemo3{

	public static void main(String[] args) {
		
		ChildClass3 ch3=new ChildClass3();
		ch3.print();
		

	}
	
	

}
