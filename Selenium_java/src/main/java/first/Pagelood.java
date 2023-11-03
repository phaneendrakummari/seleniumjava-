package first;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagelood {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    Instant starttime =	Instant.now();
	    System.out.println(starttime.toString());
		
		driver.get("https://www.royalmansour.com/en/");
		
		Instant endtime =	Instant.now();
		System.out.println(endtime.toString());
		Duration duration= Duration.between(starttime, endtime);
		System.out.println("pageload   " +duration.toMillis());
        System.out.println(driver.getTitle());
     
        driver.quit();		

	}

}
