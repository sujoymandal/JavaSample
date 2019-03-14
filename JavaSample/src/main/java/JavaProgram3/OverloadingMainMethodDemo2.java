package JavaProgram3;

public class OverloadingMainMethodDemo2 {

	public static void main(String[] args) {

		System.out.println("working!!!");
		main(20,8);
	}

	public static void main(int x,int y) {

		System.out.println(x*y);
		
	}
}
