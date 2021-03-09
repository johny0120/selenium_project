package exampleOfSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url="https://www.snapdeal.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		
	WebElement srchbox = driver.findElement(By.id("inputValEnter"));
	srchbox.sendKeys("Shirts");
	
	driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")).click();
	
	Thread.sleep(3000);
	driver.manage().deleteAllCookies();
	
	WebElement element = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
	element.sendKeys("600107");
	WebElement element2 = driver.findElement(By.xpath("//button[@class='pincode-check']"));
	element2.click();
	
	Thread.sleep(2000);
	WebElement element3 = driver.findElement(By.xpath("//img[@title='P&V CREATIONS Cotton Blend Blue Shirt']"));
	element3.click();
	String handle = driver.getWindowHandle();
	driver.switchTo( ).window(handle);
	
	

	 
	WebElement element4 = driver.findElement(By.id("add-cart-button-id"));
	
	element4.click();
	
	
	
	
	/*driver.findElement(By.id("nav-search-submit-button")).click();
	
	WebElement element = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Black']"));
	element.click();
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//input[@type='button']")).click();
	
*/

	
	
	
	
	
	
	
	}}
	