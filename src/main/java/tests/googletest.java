package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("test");
		
	}

}
