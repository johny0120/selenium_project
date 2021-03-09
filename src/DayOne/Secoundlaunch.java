package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Secoundlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		WebElement hello = driver.findElement(By.name("q"));
		hello.sendKeys("cricket"+Keys.ENTER);
		
	}
}
