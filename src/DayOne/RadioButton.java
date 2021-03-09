package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/radio.html");
	
	WebElement s = driver.findElement(By.id("yes"));
	Thread.sleep(5000);
	s.click();
	
	WebElement c = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
	Thread.sleep(4000);
	boolean selected = s.isSelected();
	boolean selected2 = c.isSelected();

	System.out.println(selected);
	System.out.println(selected2);
	WebElement age1= driver.findElement(By.name("age"));
    age1.click();
	}
}