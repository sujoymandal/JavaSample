package JavaProgram6;

class OuterClass1{
	
	static String outerMember="outer class static member";
	
	String outerMember2="outer class non static mamber2";
	OuterClass1 o1;
	
	public static class  Nested1{
		
		public void nestedClassMethod(){
			System.out.println("its nested class method!!");
			System.out.println("comming from outer claass..."+outerMember);
			//System.out.println("comming from outer class.."+o1.);
		}
	}
	
	class Nested2{
		public void print(){
			System.out.println("its a non static class method!!");
		}
	}
}

public class NestedClassDemo1 {

	public static void main(String[] args) {

		OuterClass1.Nested1 n1=new OuterClass1.Nested1();
		n1.nestedClassMethod();
		OuterClass1 o=new OuterClass1();
		
		OuterClass1.Nested2 n2=o.new Nested2();
		n2.print();
	}

}
