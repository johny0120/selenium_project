package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Link.html");
	
	//Partial link text is used to identify the element through the related words
	// (EG) { go to home page } find the word like { home page }
	
driver.findElement(By.partialLinkText("Home Page")).click();

// { Link text } is to find the element through the link word

	// driver.findElement(By.linkText("go to home page")).click();
	 
	}

}
