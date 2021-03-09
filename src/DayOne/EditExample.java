package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		// launch the url
		driver.get("http://leafground.com/pages/Edit.html");
		
		// enter the mail
		
		WebElement yahoo = driver.findElement(By.id("email"));
		yahoo.sendKeys("johnyboy2471997@gmail.com");
		
	// using xpath append the name (r) add the name into the check box
		
	//it cant overide the check box
	// if want to enter the new value into the check box 
	// we  want to clear it and add the value into the check box
		
		
		
		WebElement google = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		google.sendKeys("Add NAme");
		
		// to get the text box value 
		WebElement getTextBox = driver.findElement(By.name("username"));
		 String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		// to clear the text box
	
	WebElement clearbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	clearbox.clear();
	
	// to check wheather the check box value is enabled or disabled
	
	WebElement disabledbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	boolean enabled = disabledbox.isEnabled();
	System.out.println(enabled);
	}

}
