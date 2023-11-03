package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://e-quarz.com/customer/auth/login");
		
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@class='btn btn--primary btn-block btn-shadow']")).click();
		String optiontoselect="Spacecrafts Wooden Desktop Computer Table Study Office Laptop Desk (Wenge)- FW-5";
		driver.findElement(By.xpath("//input[@class='form-control appended-form-control search-bar-input']")).sendKeys("laptop");
		
		List<WebElement>  optionlist= driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']"));
		System.out.println(optionlist.size());
        
		for(WebElement ele:optionlist) 
		{
			
			String currentoption=ele.getText();
			System.out.println(currentoption);
			
			if(currentoption.contains(optiontoselect)) 
			{
				ele.click();
				break;
			}
			
			
		}
		
		
	}

}
