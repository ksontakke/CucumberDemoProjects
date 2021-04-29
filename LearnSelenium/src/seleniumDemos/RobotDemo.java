package seleniumDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wordtopdf.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-uploader")).click();
		
		Robot robot=new Robot();
		
		StringSelection stringselect=new StringSelection("D:\\mydoc.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}

