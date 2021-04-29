package testDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableDemo 
{
	WebDriver driver;
	@Given("^User is on DemoWebShop login page$")
	public void user_is_on_DemoWebShop_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^User entered valid email and password$")
	public void user_entered_valid_email_and_password(DataTable credentials)
	{
		List<List<String>> data = credentials.raw();
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^User should click on log out$")
	public void user_should_click_on_log_out()
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
	    driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}		
}
