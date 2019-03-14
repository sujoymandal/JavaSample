package JavaProgram6;

interface Interface1 {
	int x = 90;

	void display();
}

public class AnonymousInnerClassDemo1 {

	
	public static void main(String[] args) {

		Interface1 d=new Interface1() {

			@Override
			public void display() {
				System.out.println(x);				
			}
			
		};
		d.display();
	}

}
