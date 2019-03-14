package JavaProgram;

class Singleton{
	
	public static Singleton single=null;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
			System.out.println("object created!!");
			return single;
		}
		else
			return single;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {

		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
	}

}
