package testCases_flipkart;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class search extends Basepage{
	
	
public void search() {
	
	Actions act = new Actions(driver);
	  WebElement mainmenu= driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[1]/a"));
	  act.moveToElement(mainmenu).build().perform();//taking mouse
	  WebElement mobiles = driver.findElement(By.xpath("//*[@id='menu-electronics-tab-0-content']/ul[1]/li[1]/a")).click();
	  
	 
	  List<WebElement> brands = driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));
	 
	  for(int i1=0;i1<brands.size();i1++){
	   System.out.println(brands.get(i1).getText());//fetching all the brands
	   if(brands.get(i1).getText().equals("Samsung"))//matching for samsung only
	   {
	    brands.get(i1).click();//clicking pon samsung
	   }
	   brands = driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));//for cache
	  }
	  WebElement searchbox = driver.findElement(By.xpath("//*[@id='searchbox']/li[2]/form/input[4]"));
	  searchbox.sendKeys("grand2");//in search box search for grand2
	  driver.findElement(By.xpath("//*[@id='searchbox']/li[2]/form/input[5]")).click();//clicking on search icon
	 
	  List<String> allLinks = new ArrayList<String>();
	  List<WebElement> data = driver.findElements(By.xpath("//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"));
	  System.out.println("total fonds are =="+data.size());//total searches coming on the page
	  for(int i2=0;i<data.size();i++){
	   System.out.println(data.get(i2).getText());//printing all samsung phones
	   if(data.get(i2).getText().contains("Grand 2"))//search for grnad2 only
	   {
	    String link = data.get(i2).getAttribute("href");//fetching all the links
	    allLinks.add(link);//adding them to list
	   
	  }
	   data = driver.findElements(By.xpath("//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"));// for cache
	}
	  System.out.println(allLinks.size());//total grand2 phones
	  for(int i=0;i<allLinks.size();i++){
	   System.out.println(allLinks.get(i));
	   driver.get(allLinks.get(i));
	   driver.findElement(By.xpath("//*[@id='mplistings']/div/div/div[1]/div[3]/a")).click();//click on view sellers
	   List<WebElement> retails = driver.findElements(By.xpath("//div[@class='cart-table']/div[starts-with(@class,'line seller-item')]/div[4]/a"));//fetching info
	   System.out.println(retails.size());
	   for(int j=0;j<retails.size();j++)
	   {
	   
	    System.out.println(retails.get(j).getText());//printing all the sellers info
	   
	   }

}
}
}
