package JavaProgarm4;

class Class11{
	static int classVariable=10;
	int instanceVariable=10;
}

public class InstanceVariableAndClassVariable {

	public static void main(String[] args) {

		Class11 obj1=new Class11();
		Class11 obj2=new Class11();
		System.out.println(obj1.classVariable);//10
		System.out.println(obj1.instanceVariable);//10
		
		System.out.println(obj2.classVariable);//10
		System.out.println(obj2.instanceVariable);//10
		
		obj1.classVariable=20;
		obj1.instanceVariable=20;
		
		System.out.println(obj1.classVariable);//20
		System.out.println(obj1.instanceVariable);//20
		
		System.out.println(obj2.classVariable);//20
		System.out.println(obj2.instanceVariable);//10
		System.out.println(Class11.classVariable);//20
		
		Class11.classVariable++;
		System.out.println(obj2.classVariable);
		System.out.println(obj1.classVariable);
	}

}
