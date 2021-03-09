package exampleOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class makeMyTripNew {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String url="https://www.makemytrip.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		
	/*	PageFactory.initElements(driver,makeMyTrip.class );*/
		driver.manage().deleteAllCookies();
	/*	makeMyTrip.login.click();
		makeMyTrip.user.sendKeys("9551387738");
		makeMyTrip.cntu.click();*/
		WebElement ent = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/a"));
		
		WebElement date = driver.findElement(By.id("city"));
		date.sendKeys("chennai");
		WebElement time = driver.findElement(By.id("hsw_search_button"));
		time.click();
		/*WebElement srch = driver.findElement(By.id("hsw_search_button"));
		srch.click();
		
		*/


		
		
		
	}

}
