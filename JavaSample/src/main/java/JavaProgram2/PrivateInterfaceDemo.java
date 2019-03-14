package JavaProgram2;

class PrivateInterfaceCreator{
	
	private interface Interface1{
		void print();
	}
	
	class PrivateInterfaceImplementor implements Interface1{

		@Override
		public void print() {
			System.out.println("its the implementation of priavte interface method!!");
			
		}
		
	}
}

class PrivateInterfaceImplementor2 implements Interface1{

	@Override
	public void print() {
		System.out.println("its second implementation of priavte interface method!!");
		
	}
	
}

public class PrivateInterfaceDemo {

	public static void main(String[] args) {

		PrivateInterfaceImplementor2 cls1=new PrivateInterfaceImplementor2();
		cls1.print();
		
	}

}
