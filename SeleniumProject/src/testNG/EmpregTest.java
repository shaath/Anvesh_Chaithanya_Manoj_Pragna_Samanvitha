package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void empreg(String f, String l)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval,"Empreg Failed");
	}

	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][2];
		
		x[0][0]="Venki";
		x[0][1]="CH";
		
		x[1][0]="Sandeep";
		x[1][1]="Kumar";
		
		x[2][0]="Sayyed";
		x[2][1]="Sk";
		
		return x;
		
	}
}
