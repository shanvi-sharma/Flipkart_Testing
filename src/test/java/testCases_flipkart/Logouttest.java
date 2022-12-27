package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.Logout;

public class Logouttest extends Basepage {
	
	@Test
	
	public void logout() {
		
		driver.findElement(Logout.btn_signout);
//		driver.findElement(Logout.btn_logout).click();
		

	}

}
