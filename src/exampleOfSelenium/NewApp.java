package exampleOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewApp  {
	 static WebDriver driver;
	static String url = "https://www.snapdeal.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[2]/img")).click();
		String windowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id='add-cart-button-id']")).click();
	

		
		//driver.findElement(ById.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/a")).click();
		
		
		
	}

}
