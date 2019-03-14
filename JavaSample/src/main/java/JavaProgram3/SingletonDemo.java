package JavaProgram3;

class SingletonClass{
	
	static SingletonClass obj=null;
	private SingletonClass(){
		
	}
	
	public static SingletonClass getInstance(){
		if(obj==null){
			obj=new SingletonClass();
			System.out.println("object created!!");
			}
		return obj;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {

		SingletonClass ss=SingletonClass.getInstance();
		SingletonClass ss2=SingletonClass.getInstance();
		SingletonClass ss3=SingletonClass.getInstance();
		SingletonClass ss4=SingletonClass.getInstance();
		
	}

}
