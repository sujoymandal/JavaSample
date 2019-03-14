package JavaProgram6;

class Byke implements Comparable<Byke>{

	String name;
	int price;
	
	public Byke(String name,int price){
		
		this.name=name;
		this.price=price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	
	@Override
	public int compareTo(Byke b) {
		if(this.price>b.price)
			return 1;
		else if(this.price<b.price)
			return -1;
		else
			return 0;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {

		Byke b1=new Byke("hero",1000);
		Byke b2=new Byke("honda",2000);
		
		if(b1.compareTo(b2)==1)
			System.out.println(b1.getName()+" is best than "+b2.getName());
		else if(b1.compareTo(b2)==-1)
			System.out.println(b2.getName()+" is best than "+b1.getName());
		else
			System.out.println("both are same "+b1.getName()+" and "+b2.getName());
		
		
		
	}

}
