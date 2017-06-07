package javaprogrammes;

import java.util.Scanner;

public class NestedIfEg2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		
		if (course.equalsIgnoreCase("selenium")) 
		{
			System.out.println("You are selected selenium");
		}
		else if (course.equalsIgnoreCase("UFT"))
		{
			System.out.println("You are selected UFT");
		}
		else if (course.equalsIgnoreCase("Manual")) 
		{
			System.out.println("You ar selected Mannual");
		}
		else
		{
			System.out.println("Select a proepr course");
		}
	}

}
