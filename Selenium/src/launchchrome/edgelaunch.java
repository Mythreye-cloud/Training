package launchchrome;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class edgelaunch {
		
		public static void main (String[] args) throws InterruptedException {
			
			
			System.setProperty ("webdriver.edge.driver","C:\\Users\\Mythreye Nelemane\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			//System.setProperty can be ignored by using Selenium Manager -> this is introduced after V-4.6.0
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.testyantra.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.close();
			//thin line of difference between close and quit. Close closes a single tab and quit closes the all the tabs associated with the same URL
			//driver.quit();
			
		}

	}


