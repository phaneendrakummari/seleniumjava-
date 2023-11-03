package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {

	public static void main(String[] args) throws Throwable {
		

	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get(" https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("phaneendra");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		
		
		}

}
