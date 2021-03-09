package samplecreations;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupScrollDrown {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://www.amazon.in/");
    
    WebElement down = driver.findElement(By.xpath("//*[@id=\'navFooter\']/div[4]/ul/li[13]/a"));
    Thread.sleep(3000);
    WebElement up = driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[4]"));
    up.click();
   // 
   
    //Type Cast
    
   // JavascriptExecutor js = (JavascriptExecutor) driver;
    
    //js.executeScript("arguments[0].scollintoview(true)", down,up);
    
    //Thread.sleep(3000);
    
    //js.executeScript("arguments[0].scollintoview(false)",up);
    
}
}