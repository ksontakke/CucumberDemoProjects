package testDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooksDemo 
{
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("^User is on demowebshop site$")
	public void user_is_on_demowebshop_site()
	{
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize(); 
	}

	@When("^User provide valid data$")
	public void user_provide_valid_data()
	{
		driver.findElement(By.id("Email")).sendKeys("khandu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("khandu");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully()
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
	    driver.findElement(By.linkText("Log out")).click();
	}
	@After
	public void closeBrowser()
	{
		driver.close();
	}
}
