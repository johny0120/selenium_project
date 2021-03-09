
package DayOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://leafground.com/pages/Button.html");
    
    // Find the xy position of the element
    
    
    WebElement getposition = driver.findElement(By.id("position"));
    Point xypoint = getposition.getLocation();
    int x = xypoint.getX();
    int y = xypoint.getY();
    System.out.println("x value is :" +x +"y value is:"+y);
    
    // to find the colour of the webelement
    
    WebElement colour = driver.findElement(By.id("color"));
    String color = colour.getCssValue("background-color");
    System.out.println("button color is :" + color);

    //find the size
    
    WebElement size = driver.findElement(By.id("size"));
   int height = size.getSize().getHeight();
   int width = size.getSize().getWidth();
   System.out.println("height is :"+ height +"width is: "+width);
   
   // to enter the home page
   
  WebElement hello = driver.findElement(By.id("home"));
   hello.click();
    
	}

}
