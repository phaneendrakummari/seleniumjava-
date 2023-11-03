package first;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrinshot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 
		 File target = new File(".//src/myntra.png");
		 
		 FileUtils.copyFile(source, target);
		 
		 driver.quit();
		
		//newWindowBtn

	}

}
