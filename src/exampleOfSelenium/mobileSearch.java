package exampleOfSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobileSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("laptop");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.getWindowHandle();
		
	
		driver.findElement(By.className("s-image")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
			//.equalsIgnoreCase("https://www.amazon.in/")
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'add-to-cart-button\']")).click();
	}

}