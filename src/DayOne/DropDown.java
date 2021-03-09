package DayOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	
	WebElement drop1 = driver.findElement(By.id("dropdown1"));
	
	//select is to select the option from the box
	
	Select select = new Select(drop1);
	select.selectByIndex(2);
	Thread.sleep(3000);
	select.selectByValue("3");
	// in automaton there is no need to use thread sleep
	
	Thread.sleep(3000);
	select.selectByVisibleText("Selenium");
	
	List<WebElement> options = select.getOptions();
	int size = options.size();
	System.out.println("numberof elements :"+ size);
	
	drop1.sendKeys("loadrunner");
	
	
	// multiple select
	
	WebElement multiple = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
	
	Select multiselectBox = new Select(multiple);
	
	multiselectBox.selectByIndex(1);
	multiselectBox.selectByIndex(2);
	multiselectBox.selectByIndex(3);
}
}