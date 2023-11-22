

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLINKS {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://hrms.marolix.com/");		//http://www.deadlinkcity.com/
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
        System.out.println(links.size());
        for(int i=0;i<links.size();i++) {
        	
        	WebElement element = links.get(i);
        	String url =element.getAttribute("href");
        	URL link = new URL(url); 
        	
        	HttpURLConnection httpconn =(HttpURLConnection) link.openConnection();
        	Thread.sleep(2000);
           httpconn.connect();
           
          int responsecode= httpconn.getResponseCode();
          
          if(responsecode>=400) {
        	  System.out.println(url+"  -"+ "is broken link");
        	  
          }
          else
          {
        	  System.out.println(url+"  -"+ "is valid  link");
          }
           
        }
       
	}

}
