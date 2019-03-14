package JavaProgram3;

class PrivateConstructorClass{
	
	String name;
	private PrivateConstructorClass(){
		
	}
	
	public static PrivateConstructorClass getInstance(){
		return new PrivateConstructorClass();
	}
	
	public   void setName(String nm){
		this.name=nm;
	}
}

public class PrivateConstructorDemo {

	public static void main(String[] args) {

		//PrivateConstructorClass cc=new PrivateConstructorClass();
		//can't create object through constructor because its private
		
		PrivateConstructorClass cc=PrivateConstructorClass.getInstance();
		cc.setName("abc");
		PrivateConstructorClass cc2=PrivateConstructorClass.getInstance();
		cc2.setName("xyz");
		System.out.println(cc.name);
		System.out.println(cc2.name);
	}

}
