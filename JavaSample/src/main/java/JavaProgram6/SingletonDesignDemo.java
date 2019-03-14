package JavaProgram6;

class SingleTon1{
	
	public static SingleTon1 single=null;
	
	private SingleTon1(){
		//make the constructor private so that no one can create object of this class through constructor
	}
	
	public static SingleTon1 getInstance(){
		//create static class which return object of this class
		if(single==null){
			single=new SingleTon1();
			System.out.println("object created!!");
			return single;
		}
		else
			return single;
	}
	
}

public class SingletonDesignDemo {

	public static void main(String[] args) {

		SingleTon1 obj1=SingleTon1.getInstance();
		SingleTon1 obj2=SingleTon1.getInstance();
		SingleTon1 obj3=SingleTon1.getInstance();
		SingleTon1 obj4=SingleTon1.getInstance();
	}

}
