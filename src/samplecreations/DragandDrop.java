package samplecreations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(5000);
		WebElement src = driver.findElement(By.id("credit2"));
		WebElement dst = driver.findElement(By.id("bank"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, dst).build().perform();
		
		Thread.sleep(3000);
	//	WebElement src2 = driver.findElement(By.id("fourth"));
	//	WebElement dst2 = driver.findElement(By.id("amt"));
	//	acc.dragAndDrop(src2, dst2).build().perform();
}
}