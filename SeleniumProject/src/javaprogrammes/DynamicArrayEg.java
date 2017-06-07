package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[6];
		
		System.out.println(x.length);
		
		//Writing the data into array
		x[2]="UFT";
		x[4]=50000;
		x[3]=50000;
		x[2]="Manual";
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
