package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverOpsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		//Focusing on cat
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(5);
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span[1]"));
		//Focus on books
		act.moveToElement(books).build().perform();
		Sleeper.sleepTightInSeconds(5);
		//Click on textbooks
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div/a[8]/span")).click();
	}

}
