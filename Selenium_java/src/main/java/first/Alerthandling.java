package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/selenium/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("9009poj0");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Alert  ale=driver.switchTo().alert();
		//ale.accept();
		//ale.dismiss();
		//ale.getText();
		System.out.println(ale.getText());
		
		
	}

}
