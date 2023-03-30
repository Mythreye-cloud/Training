package launchchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch1 
{
	
	public static void main (String[] args) throws InterruptedException {
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Mythreye Nelemane\\Downloads\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty can be ignored by using Selenium Manager -> this is introduced after V-4.6.0
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
		//thin line of difference between close and quit. Close closes a single tab and quit closes the all the tabs associated with the same URL
		//driver.quit();
		
	}

}
