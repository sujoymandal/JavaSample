package JavaProgram6;

class NumberClass{
	int x;
	NumberClass(int x){
		this.x=x;
	}
}
public class ObjectRefernecDemo {

	public static void main(String[] args) {

		NumberClass n1=new NumberClass(3);
		System.out.println(n1.x);
		NumberClass n2=n1;
		n2.x=5;
		System.out.println(n2.x);
		System.out.println(n1.x);
		
	}

}
