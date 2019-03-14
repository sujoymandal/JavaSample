package JavaProgram8;

class SingleTon1{
	
	static SingleTon1  single=null;
	private SingleTon1(){
		
	} 
	
	public static SingleTon1 getInstance(){
		
		if(single==null){
			single=new SingleTon1();
			System.out.println("Object Created!!");
			return single;
		}
		return single;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {

		SingleTon1 obj1=SingleTon1.getInstance();
		SingleTon1 obj2=SingleTon1.getInstance();
		SingleTon1 obj3=SingleTon1.getInstance();
		SingleTon1 obj4=SingleTon1.getInstance();
	}

}
