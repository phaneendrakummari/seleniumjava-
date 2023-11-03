package isuitelistener;

import org.testng.IExecutionListener;

public class Exelistener implements IExecutionListener{
	
	public void onExecutionStart() {
		System.out.println("execution start");
	}
	public void onExecutionFinish() {
		System.out.println("execution finish");
		
	}
	
	
	

}
