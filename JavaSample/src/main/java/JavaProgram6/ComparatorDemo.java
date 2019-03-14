package JavaProgram6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BykeComparator implements Comparator<Byke>{

	@Override
	public int compare(Byke b1, Byke b2) {
		if(b1.getPrice()>b2.getPrice())
			return 1;
		else if(b1.getPrice()==b2.price)
			return 0;
		else
			return -1;
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {

		Byke b1=new Byke("hero",1000);
		Byke b2=new Byke("honda",4000);
		Byke b3=new Byke("tvs",2000);
		Byke b4=new Byke("bajaj",3000);
		
		List<Byke> bykes=new ArrayList<Byke>();
		bykes.add(b1);
		bykes.add(b2);
		bykes.add(b3);
		bykes.add(b4);
		
		Collections.sort(bykes,new BykeComparator());
		for(Byke b:bykes)
			System.out.println(b.getName());
		
	}

}
