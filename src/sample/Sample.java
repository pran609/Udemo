package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

 public static void main(String[] args) throws InterruptedException
 {
	 
	 
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com/");
	Thread.sleep(10000);
	driver.quit();
	
	
	
	
	
}
	
}
