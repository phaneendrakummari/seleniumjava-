package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartt {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement element =driver.findElement(By.xpath("//div[@class='_3n8fnarc _3n8fnakj _3n8fnadp _3n8fna1 _3n8fna6v _1i2djtb9 _1i2djt0 _9nihix4g']"));
		
		Point ps= element.getLocation();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy" +ps);
		//div[@class='_3n8fnarc _3n8fnakj _3n8fnadp _3n8fna1 _3n8fna6v _1i2djtb9 _1i2djt0 _9nihix4g']
	}

}
