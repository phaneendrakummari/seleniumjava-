package testngss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrm {
	
	WebDriver driver ;
	
	@Test
	public void launchapp() {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	
	@Test
	public void Enterlogindetails() 
	{
	
		
		driver.findElement(By.name("username")).sendKeys("Admin");	
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
	}

}
