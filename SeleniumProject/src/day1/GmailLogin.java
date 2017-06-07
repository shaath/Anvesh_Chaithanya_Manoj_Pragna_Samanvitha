package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		//Launching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launch gmail 
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email textbox
		WebElement email=driver.findElement(By.id("identifierId"));
		//send email id into email 
		email.sendKeys("seleniumtrainer449");
		
		//Clear the text in the textbox
//		email.clear();
		//click on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
//		Sleeper.sleepTightInSeconds(5);
		//Entering text into password field
		driver.findElement(By.name("password")).sendKeys("123456789");
		//Clicking on the next button
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	}

}
