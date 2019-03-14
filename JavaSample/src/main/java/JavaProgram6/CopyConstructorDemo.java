package JavaProgram6;

class CopyConstructor1{
	String name;
	int val;
	
	CopyConstructor1(String name,int val){
		this.name=name;
		this.val=val;
	}
	
	CopyConstructor1(CopyConstructor1 c){
		this.name=c.name;
		this.val=c.val;
	}
}


public class CopyConstructorDemo {

	public static void main(String[] args) {

		CopyConstructor1 c1=new CopyConstructor1("abc",5);
		CopyConstructor1 c2=new CopyConstructor1(c1);
		System.out.println(c1.name+" and "+c1.val);
		System.out.println(c2.name+" and "+c2.val);
	}

}
