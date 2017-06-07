package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Primus_Login 
{
	public static WebDriver driver;
	@BeforeClass
	public void br_Launch()
	{
		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void app_Launch()
	{
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void app_Login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void app_Logout()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterClass
	public void br_Close()
	{
		driver.close();
	}

}
