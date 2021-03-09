package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\drive\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions acc = new Actions(driver);
		//acc.clickAndHold(from).moveToElement(to).release(to).build().perform();
	
		acc.dragAndDrop(from, to);
		Thread.sleep(3000);
		acc.build().perform();
	}
}
