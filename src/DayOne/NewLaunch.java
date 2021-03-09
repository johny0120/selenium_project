package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewLaunch {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//launch the snapdeal browser 
		// Search the shirts
		
		driver.get("https://www.snapdeal.com/");
		
		// To print the current page
		
		String hh = driver.getTitle();
		System.out.println(hh);
		
		// To Create the current url page
		
		String jj = driver.getCurrentUrl();
		System.out.println(jj);
		
		// ToFind the Locator
		
		WebElement mail = driver.findElement(By.id("inputValEnter"));
		mail.sendKeys("shirts");
		
		//To Fill The Password
		
		
		WebElement log = driver.findElement(By.className("searchTextSpan"));
		log.click();
		 
		// search the shirts
		WebElement jh = driver.findElement(By.className("cartTextSpan"));
		jh.click();
			
        }
        }



