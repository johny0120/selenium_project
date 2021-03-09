package samplecreations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement mail = driver.findElement(By.id("email"));
	mail.sendKeys("8056039733");
	
	Actions acc = new Actions(driver);
	
	acc.doubleClick(mail).contextClick(mail).build().perform();
	
	Robot rb = new Robot();
	for(int  i=0;i<3;i++);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.click();
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	 
	//WebElement pwd = driver.findElement(By.id("pass"));
	//pwd.sendKeys("preach");
	
	

}
}