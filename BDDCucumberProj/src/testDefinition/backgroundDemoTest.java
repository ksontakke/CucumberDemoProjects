package testDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class backgroundDemoTest 
{
	WebDriver driver;
	@Given("^I im on the demowebshop homw page$")
	public void i_im_on_the_demowebshop_homw_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@Then("^I should see title contains shop$")
	public void i_should_see_title_contains_shop()
	{
	    assert driver.getTitle().contains("shop");
	    driver.close();
	}

	@Then("^I should see page source contains shop$")
	public void i_should_see_page_source_contains_shop()
	{
	  assert driver.getPageSource().contains("shop");
	  driver.close();
	}
}
