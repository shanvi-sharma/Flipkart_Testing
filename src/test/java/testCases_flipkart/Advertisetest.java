package testCases_flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.advertise;
import Utilities.ReadingPropertiesFile;


public class Advertisetest extends Basepage{
	@Test
	public void advertise() throws InterruptedException {
		driver.findElement(advertise.more_bar);

		driver.findElement(advertise.advertise_bar).click();
		 
      //  Thread.sleep(60000);
	}
}
