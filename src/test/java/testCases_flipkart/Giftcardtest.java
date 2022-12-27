package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.Giftcard;


public class Giftcardtest extends Basepage{
	
	@Test
	
	public void giftcard() {
		
		driver.findElement(Giftcard.search_bar).click();
		
	}

}
