package exampleOfSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class makeMyTrip {
	@FindBy(xpath="//li[@data-cy='account']")
	public static WebElement login;
	@FindBy(id="username")
	public static WebElement user;
	@FindBy(xpath="//button[@data-cy='continueBtn']")
	public static WebElement cntu;
	
	

}
