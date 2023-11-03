package testngss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webbtable {

	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    int rowscount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
	    
	    System.out.println(rowscount);
	    
	    int columnscount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
	    
	    System.out.println(columnscount);
	    
	    for(int i=2;i<=rowscount;i++) {
	    	System.out.println(i+":");
	    	for(int j=2;j<=columnscount;j++) {
	    		String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
	    		System.out.println(value);
	    	}
	    	
	    	
	    }
	}

	
	
	
	
}
