package isuitelistener;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass2 {
	
	
	
	@BeforeTest
	public void before_test2() {
		System.out.println("Before testclass 2");
		
		
	}
    @Test
    public void testpack2() {
    	System.out.println("test function from testclass 2");
    	
    	
    }
    @AfterTest
	public void afer_test2() {
		
		System.out.println("After testclass 2");
	}
}
