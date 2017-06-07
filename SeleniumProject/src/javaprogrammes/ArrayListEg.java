package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList<String>();
		
		//Writing the data into arraylist
		s.add("Selenium");
		s.add("UFT");
		s.add("Manual");
		s.add("Apple");
		s.add(2, "Sharath");
		//Find the size of the arraylist
		
		System.out.println(s.size());
		
		//Reading the data from arraylist
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
		}

	}

}
