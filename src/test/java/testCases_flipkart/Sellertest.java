package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.seller;

public class Sellertest extends BasicTest {
	
	@Test
	
	public void seller() {
		
		driver.findElement(seller.search_bar);
	}

}
