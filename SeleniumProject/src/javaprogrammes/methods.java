package javaprogrammes;

public class methods {

	public static String course;
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);

		methods m=new methods();
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
		
		
		int result=m.sum(60,40);
		System.out.println(result);
	}

	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static method with returning value
	public static String function2()
	{
		int f;
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non static method without returning any value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Non static method with returning value
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	//Sum 
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
}
