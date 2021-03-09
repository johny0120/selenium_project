package exampleOfSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInputLaunch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Browser Name");
		String nextLine = sc.nextLine();
		if(nextLine.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Murali\\eclipse-workspace\\Firstsellaunch\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else {
			System.out.println("User Enters The Invalid Key");
		}
	}

}
