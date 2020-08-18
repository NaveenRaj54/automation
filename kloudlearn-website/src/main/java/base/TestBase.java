package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.TestUtil;

public class TestBase {
	  public static WebDriver browser;

	    public static void initialization(){
	    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	        browser = new ChromeDriver();
	        browser.manage().window().maximize();
	        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }

}