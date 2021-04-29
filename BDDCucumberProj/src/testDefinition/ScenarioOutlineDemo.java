package testDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineDemo 
{
	WebDriver driver;
	@Given("^User should on webshop login page$")
	public void user_should_on_webshop_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^User login with ([^\\\"]*) and ([^\\\"]*)$")
	public void User_login_with_email_and_password(String email,String password)
	{
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should see logout link$")
	public void user_should_see_logout_link()
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
}
