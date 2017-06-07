package javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) 
	{
		Set<Object> x=new HashSet<Object>();
		
		//Writing the data into hashset
		
		x.add("Selenium");
		x.add(50000);
		x.add("Manual");
		x.add("Apple");
		x.add("Boll");
		x.add("Apple");
		
		Iterator<Object> it=x.iterator();
		
		//Reading the data from hashset
		
		while (it.hasNext())
		{
			Object text=it.next();
			System.out.println(text);
		}

	}

}
