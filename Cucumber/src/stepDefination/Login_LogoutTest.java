package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_LogoutTest 
{
	public static WebDriver driver;
	@Given("^Browser launched and navigated to url$")
	public void browser_launched_and_navigated_to_url() throws Throwable
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("^Tester Enter username and password$")
	public void tester_Enter_username_and_password() throws Throwable 
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^Click on login$")
	public void click_on_login() throws Throwable 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^display welcome admin message$")
	public void display_welcome_admin_message() throws Throwable 
	{
		String expval="Welcome Admin";
		String actval=driver.findElement(By.partialLinkText("Welcome")).getText();
		Assert.assertEquals(expval, actval);
	}

	@When("^Tester clicks and welcome admin link$")
	public void tester_clicks_and_welcome_admin_link() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout$")
	public void also_clicks_on_logout() throws Throwable 
	{

		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^display login page$")
	public void display_login_page() throws Throwable
	{
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}
}
