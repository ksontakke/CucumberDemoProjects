package seleniumDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {
		public static void main(String[] args) throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "G:\\Tools\\CapGTesting\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
						
			File credentials=new File("G:\\Tools\\CapGTesting\\SeleniumSoftware\\data.xlsx");
			FileInputStream fis=new FileInputStream(credentials);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(0);
			
			int rowcount=sheet1.getLastRowNum();
			
			for(int i=0;i<=rowcount;i++)
			{
				String username=sheet1.getRow(i).getCell(0).getStringCellValue();
				String password=sheet1.getRow(i).getCell(1).getStringCellValue();
				driver.get("http://demowebshop.tricentis.com/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("Email")).sendKeys(username);
				driver.findElement(By.name("Password")).sendKeys(password);
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				driver.findElement(By.linkText("Log out")).click();
			}
			driver.quit();

	}

}

