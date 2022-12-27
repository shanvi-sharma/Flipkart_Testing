package testCases_flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import TestPages.Basepage;
import TestPages.Purchase;
import Utilities.ReadingPropertiesFile;

public class purchase extends Basepage{
	
	@Test
	public void purchase() {
		
		driver.findElement(Purchase.btn_sSearchBox)).sendKeys(ReadingPropertiesFile.getProperty("sBookKey"));

		WebElement searchResult = getElement(By.xpath(sSearchResult));
		searchResult.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sBookName))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();

		getElement(By.xpath(sViewCartXPath)).click();
		getElement(By.cssSelector("form[id='view-cart-form'] button")).click();
		getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("test@testmail.com");
	}
	
	

}
