package JavaProgram5;

import java.util.Hashtable;

class One{
	public void pritn(){
		System.out.println("this method will be called!!");
	}
}

class Two{
	
	public final static One obj=new One();
}

public class DesignConceptOfPrintln {

	public static void main(String[] args) {

		Two.obj.pritn();
		
	}

}
