package seleniumDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
			
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	     driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();//login
		
		driver.findElement(By.xpath("//b[contains(text(),'Buzz')]")).click();
		driver.findElement(By.xpath("//textarea[@id='createPost_content']")).sendKeys("A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming. Modern computers have the ability to follow generalized sets of operations, called programs. These programs enable computers to perform an extremely wide range of tasks. A \"complete\" computer including the hardware, the operating system (main software), and peripheral equipment required and used for \"full\" operation can be referred to as a computer system. This term may as well be used for a group of computers that are connected and work together, in particular a computer network or computer cluster."); 
				
		driver.findElement(By.xpath("//input[@id='postSubmitBtn']")).click();
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		
		WebElement view=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
				//driver.findElement(By.xpath("//a[contains(text(),'abc')]"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
		
			
		if(view.isDisplayed()) {
			System.out.println("displayed");
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();//logout
			driver.close();
		}
		else {
			System.out.println("not displayed");
			driver.close();
		}

	}
}

