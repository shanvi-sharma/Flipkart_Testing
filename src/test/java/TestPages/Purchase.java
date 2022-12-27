package TestPages;

public class Purchase {
	
	
	public static String sBookKey = "Selenium";
	public static final String btn_sSearchBox = "fk-top-search-box";
	public static final String sSearchResult = "//li[contains(text(),'in')]//span";
	public static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	public static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
	public static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";

	
	
}
