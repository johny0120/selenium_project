package exampleOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCart {

	public static void main(String[] args) {
		WebDriver driver;
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("http://automationpractice.com/index.php");
   driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
   
   
   WebElement img = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"));
   

   
   driver.findElement(By.id("quantity_wanted")).clear();
   
   driver.findElement(By.id("quantity_wanted")).sendKeys("3");
   
   
		
		
	}
}
