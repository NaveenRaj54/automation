package tests;

import static base.TestBase.initialization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import static base.TestBase.browser;
	
public class LoginTest{
	LoginPage LoginPage;
	  
	@BeforeClass
	public void setUp(){
		initialization();
	    LoginPage = new LoginPage();
	       
	    }

	@Test
	public void login() throws InterruptedException
	{
		pages.LoginPage.signin();	
	}
	
	@AfterClass
    public void tearDown() {
        browser.quit();
    }
}