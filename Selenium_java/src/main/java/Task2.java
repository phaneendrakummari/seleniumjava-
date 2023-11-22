import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {
	WebDriver driver;

	@BeforeMethod
	public void setup(){
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");	
	}
	@Test
	public void logintest() {
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		
	}
	@Test
	public void loginfail() {
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassw");
		driver.findElement(By.id("btn-login")).click();
		String cururl=driver.getCurrentUrl();
		assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment", cururl);
	}
	@AfterMethod
	public void failurescreenshot(ITestResult testresult) throws IOException {
		if(testresult.getStatus()==ITestResult.FAILURE)
		{
			File scrfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("screenshotsoffailure\\"+testresult.getName()+ "-"+".png"));
		}
		
	}
	@AfterClass
	public void shutdown() {
		//driver.quit();
	}
		
		
		

	}


