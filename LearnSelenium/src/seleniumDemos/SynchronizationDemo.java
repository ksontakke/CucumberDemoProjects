package seleniumDemos;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		 driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
			
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String Expectedtitle="OrangeHRM";
			System.out.println(Expectedtitle);
			String Actualtitle=driver.getTitle();
			System.out.println(Actualtitle);
			
			if(Expectedtitle.equals(Actualtitle)) 
			{
	     
			        
			        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
			        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			        driver.findElement(By.xpath("//a[@id='welcome']")).click();
			        
			        WebDriverWait Mywait=new WebDriverWait(driver,10);
			        Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]")));
			        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();			}

			else
			{
				System.out.println("titles are different");
			}
			
			
			
			
				
	}
}