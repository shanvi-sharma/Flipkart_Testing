package TestPages;

import org.openqa.selenium.By;

public class Loginpage {
	
	
	public static By btn_login = By.xpath("//a[contains(text(),'Login')]");
//	public static By btn_loginwithpass = By.xpath("//button[contains(text(),'Login with Password')]");
//	public static By txt_username = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	public static By txt_username = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
//	public static By txt_password = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	public static By txt_password = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
//	public static By btn_signIn = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	public static By btn_signIn = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]");
//	public static By btn_error = By.xpath("//*[@class='ZAtlA-']");
}
