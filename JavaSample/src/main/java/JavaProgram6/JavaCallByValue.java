package JavaProgram6;

class Number2{
	int x;
	Number2(int x){
		this.x=x;
	}
}

public class JavaCallByValue {

	public static void main(String[] args) {

		Number2 n1=new Number2(5);
		increment(n1);
		System.out.println(n1.x);
	}

	public static void increment(Number2 n){
		Number2 b=n;
		b.x++;
		System.out.println(b.x);
		
		Number2 a=new Number2(b.x);
		a.x++;
		System.out.println(a.x);
	}
	
}
