package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
	    WebElement	element=driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=10232440011&ref_=footer_reload_us']"));
	
	    Point ps = element.getLocation();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy"+ps);
		
		
		
		//a[@href='/gp/browse.html?node=10232440011&ref_=footer_reload_us']
		

	}

}
