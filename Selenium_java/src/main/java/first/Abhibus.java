package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Nandyala");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Nandyala']")).click();
		
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Hyderabad");
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Hyderabad']")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		driver.findElement(By.xpath("//a[text()=19]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		
		
	
	}

}
