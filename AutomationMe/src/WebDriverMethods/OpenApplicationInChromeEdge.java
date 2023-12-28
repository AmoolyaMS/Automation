package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenApplicationInChromeEdge {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();
		demo(driver1);
		demo(driver2);
	}
	public static void demo(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.fb.com");
		Thread.sleep(2000);
		//close all the web pages
		driver.quit();
		
	}

}
