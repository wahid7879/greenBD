package osc.utilities;

import cucumber.api.java.After;


public class AfterAction {
	@After
    public static void tearDown() {
    	System.out.println(">> End of the transaction");
    	OscDriverSetup.tearDown();
	}

}
