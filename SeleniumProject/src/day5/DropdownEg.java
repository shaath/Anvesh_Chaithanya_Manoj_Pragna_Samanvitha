package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
		s.selectByIndex(2);
		Sleeper.sleepTightInSeconds(5);
		s.selectByValue("saab");
		Sleeper.sleepTightInSeconds(5);
		s.selectByVisibleText("Volvo");
		
	}

}
