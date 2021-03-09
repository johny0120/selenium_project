package exampleOfSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				public class flipkart {
	
	 public static void main(String[] args) throws AWTException {
		 WebDriver driver;
		 String url="https://www.redbus.in/travels/tippu-sultan-travels-chni";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\git\\PageObjectModel_Example\\pom\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		PageFactory.initElements(driver,flipkartBase.class );
	
		flipkartBase.src.sendKeys("chennai");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
		
		flipkartBase.dst.sendKeys("tirunelveli");
	rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		flipkartBase.date.sendKeys("13/01/2021");
		Actions ac= new Actions(driver);
		ac.contextClick().perform();
		
	/*	Alert alert = driver.switchTo().alert();
	    alert.dismiss();
		driver.manage().deleteAllCookies();
		driver.switchTo().alert().dismiss();*/
		flipkartBase.srch.click();
	}

}
