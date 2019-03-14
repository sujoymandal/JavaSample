package JavaProgarm4;

final class Parent1{
	public void print(){
		System.out.println("parent class!!");
	}
}

class Child1  {//can not extend the parent class
	public void print(){
		System.out.println("not a inherited method!!");
	}
}

public class StopInheritanceDemo1 {

	public static void main(String[] args) {
		
		Parent1 p=new Parent1();
		p.print();
		
		Child1 c=new Child1();
		c.print();
		
	}

}
