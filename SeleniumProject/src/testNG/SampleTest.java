package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest
{
	@Test(dataProvider="d")
	public void x(String br, String url)
	{
		System.out.println(br+"---"+url);
		WebDriver driver=null;
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
	}

	@DataProvider(parallel=true)
	public Object[][] d()
	{
		Object[][] x=new Object[3][2];
		
		x[0][0]="firefox";
		x[0][1]="http://google.com";
		
		x[1][0]="chrome";
		x[1][1]="http://gmail.com";
		
		x[2][0]="ie";
		x[2][1]="http://seleniumhq.com";
		
		return x;
	}
}
