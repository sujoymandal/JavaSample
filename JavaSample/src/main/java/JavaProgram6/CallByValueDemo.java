package JavaProgram6;

public class CallByValueDemo {

	public static void main(String[] args) {

		int x=10;
		System.out.println(x);
		
		System.out.println(increment(x));
		System.out.println(x);
	}

	public static int increment(int x){
		x=x+1;
		System.out.println(x);
		return x;
	}
}
