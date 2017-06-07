package methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException 
	{
		BasicMethodsEg b=new BasicMethodsEg();

//		int res=b.sum(40, 60);
//		System.out.println(res);
		
		b.br_Launch("firefox","http://Seleniumhq.com");
		
		
		b.takes_Screenshot("F:\\Evening 9 30 New\\SeleniumProject\\src\\screenshots\\Selh.bmp");;
	
	}

}
