package samplecreations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechnology {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement mou1 = driver.findElement(By.xpath("//a[@href='courses.html']"));
		
		
		Actions acc = new Actions(driver);
		acc.moveToElement(mou1).perform();
		WebElement mou2 = driver.findElement(By.xpath("//*[@id=\'nav-wrapper\']/ul/li[3]/ul/li[9]/a/span"));
		acc.moveToElement(mou2).perform();
		mou2.click();
		
		
		
		
	}

}
