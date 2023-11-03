package testngss;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asertt {
	
	
	@Test 
	public void googleverify() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/ ");
		driver.findElement(By.name("q")).sendKeys("youtube",Keys.ENTER);
		String expectedtitle= "youtube - Google Searchhh";
		String actualtitle =driver.getTitle();
		assertEquals(actualtitle, expectedtitle);
		driver.quit();
		
	}

}
