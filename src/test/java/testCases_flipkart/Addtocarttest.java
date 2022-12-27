package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.addtocart;

public class Addtocarttest extends Basepage {
	
	@Test
	
	public void cart() throws InterruptedException {
		
		driver.findElement(addtocart.search_appliances);
		Thread.sleep(30);
	//	driver.findElement(addtocart.search_television);
	//	driver.findElement(addtocart.btn_tv).click();
		
	}

}
