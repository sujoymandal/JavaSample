package JavaProgram6;

class Number{
	int x;
	Number(int x){
		this.x=x;
	}
}
public class CallByReference {

	public static void main(String[] args) {

		Number n1=new Number(5);
		System.out.println(n1.x);
		increment(n1);
		System.out.println(n1.x);
		
	}

	public static void increment(Number n){
		
		n.x++;
		System.out.println(n.x);
	}
}
