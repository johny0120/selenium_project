package samplecreations;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("8056039733");
		
		Actions acc = new Actions(driver);
		
		acc.doubleClick(mail).contextClick(mail).build().perform();
		

}}
