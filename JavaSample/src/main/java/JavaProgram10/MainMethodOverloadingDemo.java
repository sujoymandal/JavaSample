package JavaProgram10;

public class MainMethodOverloadingDemo {

	public static void main(String[] args) {

		main("abc","xyz");
		
		MainMethodOverloadingDemo obj=new MainMethodOverloadingDemo();
		obj.main();
		obj.main("ijk");
	}
	
	public void main(){
		System.out.println("main method1!!");
	}
	
	public void main(String s){
		System.out.println("main method2.."+s);
	}
	public static void main(String s1,String s2){
		
		System.out.println(s1+s2);
	}

}
