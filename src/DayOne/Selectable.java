package DayOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//the xpath is identify only single selectable element 
		// because of the tagname ol/
		// so we need to add the tagname /li in the xpath field
		// we will get the size of the particular elements lists
		//so that we are using the tagname /li
		
		List<WebElement> select = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = select.size();
		System.out.println(size);
		
        Actions acc = new Actions(driver);
        acc.keyDown(Keys.CONTROL)
        .click(select.get(0))
        .click(select.get(1))
        .click(select.get(2))
        .build().perform();
}
}