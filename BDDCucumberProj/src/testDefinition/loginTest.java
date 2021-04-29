package testDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest 
{
	WebDriver driver;
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() 
	{
		driver.findElement(By.id("Email")).sendKeys("khandu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("khandu");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should view Logout button$")
	public void user_should_view_Logout_button() 
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
}
