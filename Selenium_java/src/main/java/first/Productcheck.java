package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Productcheck {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://e-quarz.com/");
		
		Actions act = new  Actions(driver);
		
		   WebElement  sou =driver.findElement(By.xpath("//div[@class='navbar-tool-icon-box bg-secondary']"));
		
		   act.moveToElement(sou).build().perform();
		
		driver.findElement(By.xpath("(//a[@href='http://e-quarz.com/customer/auth/login'])[1]")).click();	
		
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		   
	    driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
	    
	    Thread.sleep(12000);
	    
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	    
	   
	    
	}

}
