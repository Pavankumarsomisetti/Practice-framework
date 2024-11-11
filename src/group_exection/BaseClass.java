package group_exection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	
	public Data_utility du = new Data_utility();
	
	@BeforeClass(alwaysRun = true)
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		//driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(du.getDatafromProperties("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(du.getDatafromProperties("password"));
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
	driver.findElement(By.xpath("//a[text()='Logout']")).click();	
	}
	
	@AfterClass(alwaysRun = true)
	public void closebrowser()
	{
		driver.close();
	}
}
