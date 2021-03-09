package samplecreations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
        	 driver.get("https://www.catch.com.au/");
        	 
        	 WebElement search = driver.findElement(By.id("catch-app-1"));
        	 search.sendKeys("iphone12");
        	 
        	 WebElement button = driver.findElement(By.className("css-14vkg8y"));
        	 button.click();
        	
        	 WebElement world = driver.findElement(By.xpath("//*[@id='5457132']/div/div[1]/div/form/div/button"));
        	 world.click();
        	 
        	 
		}
}
