 package first;

import java.awt.Point;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Equarz {

	public static void main(String[] args) throws InterruptedException {
		
	        WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			
			driver.get("http://e-quarz.com/");
			
			driver.findElement(By.xpath("//button[@class='close __close']")).click();	
			
			Thread.sleep(2000);
			
			Actions act = new  Actions(driver);
			
		   WebElement  sou =driver.findElement(By.xpath("//div[@class='navbar-tool-icon-box bg-secondary']"));
		
		   act.moveToElement(sou).build().perform();
		  
		   Thread.sleep(2000);
		  
	       driver.findElement(By.xpath("(//a[@href='http://e-quarz.com/customer/auth/login'])[1]")).click();	
	   
	       driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
	   
	       driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
	   
	       driver.findElement(By.xpath("//i[@class='czi-eye password-toggle-indicator']")).click();
	  
	       Thread.sleep(12000);
	  
	       driver.findElement(By.xpath("//input[@class='form-control border __h-40']")).click();
	  
	       driver.findElement(By.xpath("//button[@class='btn btn--primary btn-block btn-shadow']")).click();
	  
	        Thread.sleep(2000);
	
	   //     driver.findElement(By.xpath("(//img[@class='d-block w-100 __slide-img'])[1]")).click();
	
            JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	        js.executeScript("window.scrollBy(0,500)");
	        
	      //  driver.findElement(By.xpath("(//div[@class='text-center'])[4]")).click();
	
	        driver.findElement(By.xpath("(//div[@class='d-flex d-block'])[6]")).click();
	
	       driver.findElement(By.xpath("//button[@class='btn btn--primary element-center btn-gap-right']")).click();
	
	       Thread.sleep(2000);

        	driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
	
            Thread.sleep(2000);
	
	         WebElement cart=driver.findElement(By.xpath("(//a[@class='navbar-tool-icon-box bg-secondary dropdown-toggle'])[2]"));
	
	        act.moveToElement(cart).build().perform();
	
	        driver.findElement(By.xpath("//a[@class='btn btn--primary btn-sm btn-block']")).click();
	
	        WebElement dropdown = driver.findElement(By.xpath("//option[text()='Choose shipping method']"));
	        
	        Select sel = new Select(dropdown);
	
            sel.selectByIndex(1);	
//	
	//driver.findElement(By.xpath("(//a[@href='http://e-quarz.com/product/urban-ladder-mahim-2-tone-arm-without-storage-sofa-cum-bed-brown-Z3WtL7'])[1]")).click();
     //    driver.findElement(By.xpath("(//div[@class='text-center'])[4]")).click();

	}

}
 
