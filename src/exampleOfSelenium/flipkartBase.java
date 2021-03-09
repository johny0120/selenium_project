package exampleOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkartBase {
 /*public static WebElement Driver(WebDriver driver)
 return driver */
	@FindBy(id="txtSource")
    public static WebElement src;
	
	@FindBy(id="txtDestination")
	public static WebElement dst;
	
	@FindBy(id="txtOnwardCalendar")
	public static WebElement date;
	@FindBy(xpath="//button[@class='D120_search_btn searchBuses']")
	public static WebElement srch;
	
	

}
