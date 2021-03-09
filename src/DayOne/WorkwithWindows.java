package DayOne;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Window.html");
	
	String oldwindow = driver.getWindowHandle();
	WebElement firstElement = driver.findElement(By.id("home"));
	firstElement.click();
	
	Set<String> newwindow = driver.getWindowHandles();
	
	for (String newwindows : newwindow) {
		driver.switchTo().window(newwindows);
	}
	WebElement editbox = driver.findElement(By.xpath("//*['@id=\"post-153\']/div[2]/div/ul/li[1]/a/h5"));
	editbox.click();
	driver.close();
	
	driver.switchTo().window(oldwindow);
	
	WebElement openmultiple = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	openmultiple.click();
	
	int sizeofwindows = driver.getWindowHandles().size();
	System.out.println("no of windows opn:"+ sizeofwindows);
	
	
	WebElement dontcloseme = driver.findElement(By.id("color"));
	dontcloseme.click();
	Set<String> newwindowHandles = driver.getWindowHandles();
	for (String allwindows : newwindowHandles) {
		if(!allwindows.equals(oldwindow)) {
	driver.switchTo().window(allwindows).close();
	//driver.close();
	
		}
	}
	driver.quit();
}}
