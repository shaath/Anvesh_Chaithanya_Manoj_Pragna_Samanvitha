package javaprogrammes;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		while(i<=500)
		{
			System.out.println(i);
			if (i==325)
			{
				break;
			}
			i++;
		}

	}

}
