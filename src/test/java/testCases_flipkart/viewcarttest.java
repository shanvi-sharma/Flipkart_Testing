package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.viewcart;

public class viewcarttest extends Basepage {
	
	@Test
	
	public void viewcart() {
		
		driver.findElement(viewcart.search_bar);
		
	}

}
