package JavaProgram3;

public class OverloadingMainMethodDemo {

	public static void main(String[] args) {

		System.out.println("this is the entry point main method!!");
		main("first calling");
		main("first arguments ","second arguments");
		anotherMethod();
	}
	
	public static void main(String arg1) {

		System.out.println("calling from another method "+arg1);
	}
	
	public static void main(String arg1,String arg2) {

		System.out.println("calling from another method "+arg1+"with  double arguments "+arg2);
	}
	
	public static void anotherMethod(){
		main("calling from another method");
	}

}
