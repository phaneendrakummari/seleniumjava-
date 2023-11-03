package testngss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowse {
	
	WebDriver driver;
	
	@Test
    @Parameters("browsers")
    
    public void browsername(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			
			driver = new EdgeDriver();
			
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}
		driver.get("http://poojastore.marolix.com/Authenticate/Login?url=Home%2FDashBoard");
		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='col-md-6']/button[1]")).click();
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
	}
}
