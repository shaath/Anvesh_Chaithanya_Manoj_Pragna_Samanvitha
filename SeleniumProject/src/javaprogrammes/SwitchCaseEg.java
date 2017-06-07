package javaprogrammes;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		System.out.println(course);
//		String course="selenium";
		switch (course)
		{
		case "selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
