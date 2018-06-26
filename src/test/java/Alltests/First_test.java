package Alltests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_test {
	
	WebDriver driver;
	
	@Test
	
	public void testfirstcase()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@class='desktop-preHeaderLinks' and @href='/contactus']")).click();
		
		
	}

}
