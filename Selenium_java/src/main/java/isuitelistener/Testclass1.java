package isuitelistener;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass1 {

	
	@BeforeTest
	public void before_test() {
		
		System.out.println("iam Before testclass1");
	}
	@Test
	public void test_pack1() {
		
		System.out.println("testclass1");
		
	}
	@AfterTest
	public void after_test() {
		
		System.out.println("Iam after testclass1");
	}
	
}
