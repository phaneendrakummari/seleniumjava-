package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.id("name")).sendKeys(" KUMMARI PHANEENDRA");
		
		driver.findElement(By.id("phone")).sendKeys("9550230737");
		
		driver.findElement(By.id("email")).sendKeys("indraphanee82@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Phanee22");
		
		driver.findElement(By.id("address")).sendKeys("H.NO:25-684 padmavathi nagar ,nandyal AP");
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("wednesday")).click();
		driver.findElement(By.id("thursday")).click();
		driver.findElement(By.id("friday")).click();
		
		WebElement dropdown =driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select sel = new Select(dropdown);
		sel.selectByValue("5");
		
		driver.findElement(By.xpath("//label[text()='2 years']")).click();
		
	    driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
	    driver.findElement(By.xpath("//label[text()='Cucumber']")).click();
	    driver.findElement(By.xpath("//label[text()='TestNG']")).click();
	    
	    //driver.get("https://www.amazon.in/");
	    //driver.close();
	    
	    
	  System.out.println(driver.getWindowHandles());
	   
	   
		
		
		
		//WebElement checkbox=driver.findElement(By.id("monday"));
		//checkbox.click();
		//System.out.println(checkbox.isSelected());
		// driver.quit();
		
		// driver.findElement(By.id("tuesday")).click();
		
		// driver.findElement(By.linkText("Home")).click();
		
		// driver.findElement(By.id("monday")).click();
		
		//driver.get("https://www.meesho.com/");
		
		
		
	//	System.out.println(driver.getCurrentUrl());
		
	//	System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
	//	driver.close();

	}

	}


