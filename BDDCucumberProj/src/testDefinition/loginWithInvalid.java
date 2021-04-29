package testDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginWithInvalid 
{
	WebDriver driver;
	@Given("^User is on the login home page$")
	public void user_is_on_the_login_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^User enters Invalid username or password$")
	public void user_enters_Invalid_username_or_password() 
	{
		driver.findElement(By.id("Email")).sendKeys("khandu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("khandu1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should see error message$")
	public void user_should_see_error_message() throws InterruptedException
	{
		boolean view=driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).isDisplayed();
		Assert.assertTrue(view);
		Thread.sleep(3000);
	    driver.close();
	}
}
