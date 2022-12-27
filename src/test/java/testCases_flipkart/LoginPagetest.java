package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.Loginpage;
import Utilities.ReadingPropertiesFile;



public class LoginPagetest extends Basepage{
	
	@Test
	public void login() throws InterruptedException {
	
//		for login
		driver.findElement(Loginpage.btn_login);
//		driver.findElement(loginpage.btn_logIn).click();
		
//		Press continue
//		driver.findElement(Loginpage.btn_loginwithpass).click();
		
//		Enter User_name
		driver.findElement(Loginpage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));	
		
		
//		Enter Password
		driver.findElement(Loginpage.txt_password).sendKeys(ReadingPropertiesFile.getProperty("password"));
		
		
		Thread.sleep(30);
//		Press Login
		driver.findElement(Loginpage.btn_signIn).click();

//		Error
//		driver.findElement(Loginpage.btn_error).click();
		
		
		
		
	}


}
