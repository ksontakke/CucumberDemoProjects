package seleniumDemos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		System.out.println("The title of main window is: "+driver.getTitle());
		
		WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();
		
		Thread.sleep(3000);  		
		Set<String>windowIds=driver.getWindowHandles();
								

		Iterator<String>iter=windowIds.iterator();
								
		String mainWindow = iter.next();
		String childWindow= iter.next();
							

		driver.switchTo().window(childWindow);
		
		System.out.println("The title of child window is: "+driver.getTitle());
		
		//driver.close();
		
		driver.switchTo().window(mainWindow);
		
		Thread.sleep(3000);
		
		System.out.println("The title of main window is: "+driver.getTitle());
		driver.quit();
	}

}

