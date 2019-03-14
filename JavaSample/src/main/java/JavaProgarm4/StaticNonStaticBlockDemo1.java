package JavaProgarm4;

class  Demo1{
	
	public Demo1(){
		System.out.println("this the constructor of Demo1!!");
	}
	
	static{
		System.out.println("this is the static block!!");
	}
	
	{
		System.out.println("this is a non static block!!");
	}
}

public class StaticNonStaticBlockDemo1 {

	public static void main(String[] args) {

		System.out.println("this is main method!!");
		Demo1 d1=new Demo1();
		
		System.out.println("this is main method!!");
		Demo1 d2=new Demo1();
	}

}
