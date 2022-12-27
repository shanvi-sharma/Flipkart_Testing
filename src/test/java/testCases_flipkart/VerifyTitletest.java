package testCases_flipkart;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import TestPages.Basepage;

public class VerifyTitletest extends Basepage{
	
	@Test 
	public void VerifyTitle() {
		
		String actualTitle = driver.getTitle();
		//driver.manage().window().maximize();
		String expectedTitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	
	

}
