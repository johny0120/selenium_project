package DayOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/table.html");
	
	List<WebElement> column = driver.findElements(By.tagName("tr"));
	int size = column.size();
	System.out.println( "Number of column:"+ size);
	
	
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	int size2 = rows.size();
	System.out.println("Number of row:" +size2);
	
	WebElement getpercent = driver.findElement(By.xpath("//td[ normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String text = getpercent.getText();
	System.out.println( " percent is:"  +  text);
	
	 List<WebElement>  allprogress = driver.findElements(By.xpath("//td[2]"));
	
	 
	 //We are going to find the least Values 
	 //so We are going to find the integer values
	 // So we are using the generics Integer
	 
	List<Integer> numberlist = new ArrayList<Integer>();
	
		for (WebElement webElement : allprogress) {
			
			// to remove the % from the integer 
			// It can accept only integer values
			// So we are using the Replace Content
		     String indvalue=webElement.getText().replace("%", "");
		// It can Change the value from String to Integer
		     
		numberlist.add(Integer.parseInt(indvalue));
	}
System.out.println("FinalList:" +numberlist);


int smallvalue = Collections.min(numberlist);
System.out.println(smallvalue);

String smallstring = Integer.toString(smallvalue);


//driver.findElement(By.xpath("//td[normalize-space()='20%']//following::td[1]")

}}
