package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");

		//driver.manage().timeouts().implicitlyWait(.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		act.dragAndDrop(source, target).perform();


	}

}
