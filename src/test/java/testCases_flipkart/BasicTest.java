package testCases_flipkart;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.Giftcard;
import TestPages.Helpcentre;
import TestPages.Loginpage;
import TestPages.Logout;
import TestPages.addtocart;
import TestPages.advertise;
import TestPages.search;
import TestPages.seller;
import TestPages.viewcart;
import Utilities.ReadingPropertiesFile;

public class BasicTest extends Basepage {
	

	@Test (priority=1)
	public void VerifyTitle() {
		
		String actualTitle = driver.getTitle();
		//driver.manage().window().maximize();
		String expectedTitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}

	
	@Test (priority=5)
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
	
	@Test (priority=10)
	
	public void logout() {
		
		driver.findElement(Logout.btn_signout);
	
	}
	
	@Test (priority=6)
	public void search() throws InterruptedException {
		driver.findElement(search.search_bar).sendKeys(ReadingPropertiesFile.getProperty("item"));
		 
        Thread.sleep(60000);


}
	
	@Test (priority=7)
	
	public void giftcard() throws InterruptedException {
		
		driver.findElement(Giftcard.search_bar).click();
		Thread.sleep(60000);
		
	}
	
	@Test (priority=8)
	public void advertise() throws InterruptedException {
		driver.findElement(advertise.more_bar);

		driver.findElement(advertise.advertise_bar).click();
		 
       Thread.sleep(60000);
	}
	
	@Test (priority=3)
	public void help() {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(Helpcentre.help_bar);

		

}
	
@Test (priority=9)
	
	public void cart() throws InterruptedException {
		
		driver.findElement(addtocart.search_appliances);
		Thread.sleep(30);

}


@Test (priority=4)

public void seller() {
	
	driver.findElement(seller.search_bar);
}

@Test (priority=2)

public void viewcart() {
	
	driver.findElement(viewcart.search_bar);
	
}


	
	
	
	

}
