package JavaProgram3;

class Encapsulated{
	private String name;
	private int id;
	
	
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	
	public  void setName(String nm){
		 this.name=nm;
	}
	public void  setId(int id){
		 this.id=id;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Encapsulated e1=new Encapsulated();
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		e1.setName("xyz");
		System.out.println(e1.getName());

	}

}
