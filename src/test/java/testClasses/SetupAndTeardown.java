package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import pages.Page;

public class SetupAndTeardown {
	
	private static WebDriver driver;
	protected static Page basepage;
	
	@BeforeSuite
	public void browserSetup(String browser){
		switch(browser) {
		
		}
	}
	
	public void setDriverInstance() {
		basepage = new Page();
		basepage.setWebDriver(driver);
	}
}
