package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\drive\\chromedriver.exe");
      driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/checkbox.html");
	
/* To Click the Check Box  (or) To Select the CheckBox Using Xpath */
	
	WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
	java.click();
	
     /*   we Want To Check The cheK bOX wheATHER the Check Box Is selected Or Not 
      * Using Boolean Method  With The Rule Of Is Selected*/
	WebElement way = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
	
	boolean selected = way.isSelected();
	System.out.println(selected);
	
			/*We Want make sure Whether the Check box is selected r not 
			 *whether is selected want to unselect
			 *whether is not selected then leave it  */
	
	WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
	if (check.isSelected()) {
		check.click();
		Thread.sleep(5000);
	}
	WebElement check2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
	if (check2.isSelected()) {
		check2.click();
	}
	}
	
}
