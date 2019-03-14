package JavaProgram6;

class LimitedObject{
	
	public static int objCount=0;
	public static int maxCount=2;
	
	private LimitedObject(){
		
		System.out.println("object created!!");
	}
	
	public static LimitedObject getInstance(){
		if(objCount>maxCount){
			
			return null;
		}
		else{
			objCount++;
			return new LimitedObject();
			
		}
	}
}

public class CreateMaxThreeObjects {

	public static void main(String[] args) {

		LimitedObject obj1=LimitedObject.getInstance();
		LimitedObject obj2=LimitedObject.getInstance();
		LimitedObject obj3=LimitedObject.getInstance();
		LimitedObject obj4=LimitedObject.getInstance();
		LimitedObject obj5=LimitedObject.getInstance();
		LimitedObject obj6=LimitedObject.getInstance();
		LimitedObject obj7=LimitedObject.getInstance();
		LimitedObject obj8=LimitedObject.getInstance();
	}

}
