package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement shopcart=driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
		Actions act=new Actions(driver);
		act.moveToElement(shopcart).build().perform();
		
		driver.findElement(By.xpath("//input[@value='Go to cart']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		
	}

}
