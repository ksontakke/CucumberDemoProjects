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

public class DemoWebShopCart 
{
	WebDriver driver;
	
	@Given("^User is on demo login home page$")
	public void user_is_on_demo_login_home_page()
	{
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("khandu@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("khandu");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}

	@Before
	public void login() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
		
	@When("^User try to add item into cart$")
	public void user_try_to_add_item_into_cart()
	{
	   driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']")).click();
	   driver.findElement(By.xpath("//img[@alt='Picture for category Notebooks']")).click();
	   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();   
	}

	@Then("^User should see successfull message$")
	public void user_should_see_successfull_message() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean view=driver.findElement(By.xpath("//p[@class='content']")).isDisplayed();
		Assert.assertTrue(view);
	}
	
	@After
	public void logout1()
	{
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

	@Before
	public void login1() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	@When("^User try to add item into wishlist$")
	public void user_try_to_add_item_into_wishlist()
	{
	   driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Apparel & Shoes']")).click();
	   driver.findElement(By.xpath("//img[@title='Show details for Blue and green Sneaker']")).click();
	   driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-28']")).click();	   
	}

	@Then("^User should see message successfully$")
	public void user_should_see_message_successfully() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean text=driver.findElement(By.xpath("//p[@class='content']")).isDisplayed();
		Assert.assertTrue(text);
	}
	
	@After
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}