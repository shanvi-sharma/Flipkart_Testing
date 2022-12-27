package testCases_flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import TestPages.Basepage;
import TestPages.search;
import Utilities.ReadingPropertiesFile;

public class searchtest extends Basepage{
	
	@Test
	public void search() throws InterruptedException {
		driver.findElement(search.search_bar).sendKeys(ReadingPropertiesFile.getProperty("item"));
		 
        Thread.sleep(60000);


}
}
