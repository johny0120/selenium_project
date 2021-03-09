package DayOne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Alert.html");
	
	WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
	Thread.sleep(3000);
	alertbox.click();
	 
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	WebElement confirm = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	confirm.click();
	
	Alert alert2 = driver.switchTo().alert();
	Thread.sleep(3000);
	alert2.dismiss();
	
	WebElement prompt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
	prompt.click();
	

	
	Alert alert3 = driver.switchTo().alert();
	Thread.sleep(3000);
	alert3.sendKeys("johny");
	
	alert3.accept();

}
}
