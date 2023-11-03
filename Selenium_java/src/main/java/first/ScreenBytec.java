package first;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenBytec {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.abhibus.com/");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	

		byte[] bytearr=ts.getScreenshotAs(OutputType.BYTES);
		
		File destfile = new File(".//src/abhi.png");
		
		FileOutputStream fos = new FileOutputStream(destfile);
		
		fos.write(bytearr);

		fos.close();		
		System.out.println("Screenshot saved successfully");
				
		
	

	}

}
