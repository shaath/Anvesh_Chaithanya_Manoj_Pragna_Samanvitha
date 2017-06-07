package javaprogrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
		methods m=new methods();
		System.out.println(m.sum(200, 300));
		
		m.course="Selenium";
		System.out.println(m.course);

	}

}
