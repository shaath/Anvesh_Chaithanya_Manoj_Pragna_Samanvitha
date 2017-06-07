package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicMethodsEg 
{
	WebDriver driver = null;
	public static String course;
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg b=new BasicMethodsEg();
		b.function3();
		
		boolean flag=b.function4();
		System.out.println(flag);
		
		
		int result=b.sum(500,200);
		System.out.println(result);
	}

	//Static Method without returning anyvalue
	
	public static void function1()
	{
		course="Selenium";
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non Static Method Without Returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non Static Method With Returning Value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	//Sum
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	//Launching Browser
	public void br_Launch(String br,String url)
	{
		if (br.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	//Screenshot Taking
	
	public void takes_Screenshot(String path) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));

	}
	
}
