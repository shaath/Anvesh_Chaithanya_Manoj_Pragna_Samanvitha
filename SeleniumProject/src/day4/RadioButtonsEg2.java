package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
//		List<WebElement> radios=block.findElements(By.tagName("input"));
//		
//		System.out.println(radios.size());
//		
//		for (int i = 0; i < radios.size(); i++) 
//		{
//			String text=radios.get(i).getAttribute("value");
//			System.out.println(text);
//			if (text.equalsIgnoreCase("milk")) 
//			{
//				radios.get(i).click();
//			}
//			else if (text.equalsIgnoreCase("beer"))
//			{
//				radios.get(i).click();
//			}
//		}
		
		List<WebElement> group1=block.findElements(By.name("group1"));
		System.out.println(group1.size());
		for (int i = 0; i < group1.size(); i++) 
		{
			String text=group1.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("cheese"))
			{
				group1.get(i).click();
				break;
			}
		}
	}

}
