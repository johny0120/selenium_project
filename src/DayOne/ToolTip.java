package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement name = driver.findElement(By.id("age"));
		String tooltip = name.getAttribute("title");
		System.out.println(tooltip);
	}
}
 