package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
	}

}
