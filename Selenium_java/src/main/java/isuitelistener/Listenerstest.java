package isuitelistener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listenerstest implements ISuiteListener {

	public void onStart(ISuite suite) {
		
		System.out.println("Onstart suite starts" +suite.getName());
		
	}

	public void onFinish(ISuite suite) {
		
		System.out.println(" OnFinish ends" +suite.getName());
		
			
	}


}
