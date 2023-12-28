package HandlingDisableElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElentUsingScript {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
	driver.get("file:///C:/Users/msamo/OneDrive/Desktop/disabled.html");
	driver.findElement(By.id("t1")).sendKeys("qsp");
	try {
		driver.findElement(By.id("t2")).sendKeys("jsp");
	} catch (Exception e) {
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("document.getElementById('t2').value='qsp'");
	}
		
	} 
	
	
	

	

}
