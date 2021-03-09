package exampleOfSelenium;

import java.awt.Dimension;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
	static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	
	
	driver.manage().deleteAllCookies();
	
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().back();
	}

}
