package testCases_flipkart;

import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.travel;

public class Traveltest extends Basepage {
	
@Test
	
	public void travel() {
		
		driver.findElement(travel.travel_bar);
		driver.findElement(travel.btn_oneway).click();
		
		
	}

}
