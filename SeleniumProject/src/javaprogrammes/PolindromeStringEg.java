package javaprogrammes;

public class PolindromeStringEg {

	public static void main(String[] args) 
	{

		String Original="Malayalam";
		String rev="";
		
		int len=Original.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+Original.charAt(i);
		}
		System.out.println(rev);
		if (Original.equalsIgnoreCase(rev)) 
		{
			System.out.println("Given String is a polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}

	}

}
