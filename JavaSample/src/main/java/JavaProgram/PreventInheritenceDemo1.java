package JavaProgram;

 class BaseClass{ //if write final key word before class, it will not permit inheritance
	public  BaseClass(){ 
		//if write private constructor without defining any other constructor it will prevent inheritance
		System.out.println("its base class!!");
	}
}

class ChildClass  extends BaseClass{
	ChildClass(){
		System.out.println("its child class!!");
	}
}

public class PreventInheritenceDemo1 {

	public static void main(String[] args) {

		ChildClass  ch=new ChildClass();
		
	}

}
