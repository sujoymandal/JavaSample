package JavaProgram8;

class Max3ObjectCreatorClass{
	
	static int objCount=1;
	static int objMax=3;
	
	private Max3ObjectCreatorClass(){
		
	}
	
	public static Max3ObjectCreatorClass getObject(){
		if(objCount<objMax){
			
			System.out.println(objCount+" Object created!!");
			objCount++;
			return new Max3ObjectCreatorClass();
		}
		else
			return null;
	}
	
}

public class CreateMax3objectDemo {

	public static void main(String[] args) {

		Max3ObjectCreatorClass obj1=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj2=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj3=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj4=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj5=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj6=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj7=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj8=Max3ObjectCreatorClass.getObject();
		Max3ObjectCreatorClass obj9=Max3ObjectCreatorClass.getObject();
		
		
	}

}
