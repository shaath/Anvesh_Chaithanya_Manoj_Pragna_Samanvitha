package javaprogrammes;

public class ObjectEg {

	public static void main(String[] args)
	{
		Object[] x={"Selenium",30000,'M',true,333.33};
		
		System.out.println(x.length);

		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}

}
