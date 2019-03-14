package JavaProgram10;

class Encapsulate{
	
	private String name;
	
	public void setName(String nm){
		if(nm.contains("*")){
			this.name="xyz";
		}
		else 
			this.name=nm;
	}
	
	public String getName(){
		return this.name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Encapsulate  e=new Encapsulate();
		e.setName("abcd");
		String n=e.getName();
		System.out.println(n);
		e.setName("abcd*");
		System.out.println(e.getName());
	}

}
