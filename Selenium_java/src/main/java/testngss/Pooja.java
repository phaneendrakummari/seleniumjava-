package testngss;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Pooja {
	
	@Test(dataProvider = "logintest")
	
		public void datatest(String Username,String Password)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://poojastore.marolix.com/Authenticate/Login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.name("emailid")).sendKeys(Username);
			driver.findElement(By.name("pword")).sendKeys(Password);
			driver.findElement(By.xpath("// div[@class='col-md-6']/button")).click();
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", url);
			
		}
		@DataProvider(name="logintest")
		
		
		public Object[][] dataset()
		{
			Object [][] data=new Object [2][2];
			data[0][0]="admin123@gmail.com";
			data[0][1]="123456789";
			data[1][0]="pooja132@gmail.com";
			data[1][1]="1234";
			return data;
		}

		
	}




