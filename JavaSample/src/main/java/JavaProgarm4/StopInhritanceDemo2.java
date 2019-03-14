package JavaProgarm4;

class Parent2{
	private Parent2(){
		
	}
	
	public void print(){
		System.out.println("class with private constructor!!");
	}
	
	public static Parent2 getInstance(){
		return new Parent2();
	}
}

class Child2 {//can't extend the  parent2 class
	
	Parent2 pp=Parent2.getInstance();
	public void print(){
		pp.print();
	}
	
}

public class StopInhritanceDemo2 {

	public static void main(String[] args) {
		
		Child2 cc=new Child2();
		cc.print();

		Parent2 pp2=Parent2.getInstance();
		pp2.print();
	}

}
