package first;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowwhan {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String window1 = driver.getWindowHandle();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			System.out.println(handle);

			if (!window1.equals(handle)) {

				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();

			driver.findElement(By.id("firstName")).sendKeys("LIon");

			}

		}

		driver.switchTo().window(window1);

		driver.findElement(By.id("name")).sendKeys("Hello everyone");

		driver.close();
		

	}

}
