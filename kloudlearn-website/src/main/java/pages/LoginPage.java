package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;


import base.TestBase; 

public class LoginPage extends TestBase {

	
    @FindBy(xpath = "//*[@id='username']")
	public static WebElement username;
	
	@FindBy(name = "//*[@id='password']")
	public static WebElement password;

	@FindBy(xpath = "//*[@id='root']/div/div/div/div[2]/form/div[5]/div/div/span/button")
	public static WebElement signin;
	
	
	private  static WebDriverWait wait =new WebDriverWait(browser, 30);

    public LoginPage(){
        PageFactory.initElements(browser, this);
    }

	
	public static void signin() {
		username.sendKeys("narmadhasg1398@gmail.com");
		password.sendKeys("kloudone@123");
		signin.click(); 
		
	}
	
	

}
