package testngss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test(priority=1)
	
	public void testgoogle() throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/ ");
		driver.findElement(By.name("q")).sendKeys("youtube",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	////System.out.println("logged successfully");
		
		
	}
	
	@Test(priority=2,description="test facebook complterd")
public void testfacebook() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/ ");
		driver.findElement(By.name("email")).sendKeys("youtube");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

}
}
