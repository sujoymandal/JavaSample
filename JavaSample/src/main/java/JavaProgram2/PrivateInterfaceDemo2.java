package JavaProgram2;

public class PrivateInterfaceDemo2 {
	
	private interface PrivateInterface{
		void print1();
	}

	class ImplementingClass implements PrivateInterface{

		@Override
		public void print1() {
			System.out.println("implementing method");
			
		}
		
	}
	
	
	public static void main(String[] args) {

		PrivateInterfaceDemo2 iff=new PrivateInterfaceDemo2();
		iff.new ImplementingClass().print1();
	}

}
