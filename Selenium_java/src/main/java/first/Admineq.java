package first;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admineq {

	public static void main(String[] args) throws Throwable {
		
	WebDriver driver = new ChromeDriver()	;
	driver.manage().window().maximize();
	driver.get("http://e-quarz.com/admin/auth/login");
	driver.findElement(By.id("signinSrEmail")).sendKeys("arun@marolix.com");
	driver.findElement(By.id("signupSrPassword")).sendKeys("Reset@123");
	
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//input[@class='form-control form-control-lg border-0']"));
	driver.findElement(By.xpath(" //button[@class='btn btn-lg btn-block btn--primary']")).click();
	
     String	adminwindow=driver.getWindowHandle();
     
    // System.out.println(adminwindow);
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("(//a[@class='js-hs-unfold-invoker btn btn-icon btn-ghost-secondary rounded-circle'])[1]")).click();
     
    Set<String> userwindow= driver.getWindowHandles();
    
    //System.out.println(userwindow);
    
    for(String handle:userwindow)
    {
    	if(!adminwindow.equals(userwindow))
    	{
    		driver.switchTo().window(handle);
    		driver.manage().window().maximize();
    	}
    }
     
	
	}

}
