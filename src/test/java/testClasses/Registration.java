package testClasses;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Registration {
	
	@BeforeSuite
	public void browserSetup(String browser){
		switch(browser) {
		
		}
	}
	
	@Test
	public void registerNewUser() {
		
	}
	
	@AfterSuite
	public void afterExecution() {
		
	}
}
