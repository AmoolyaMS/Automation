package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allid = driver.getWindowHandles();
	for (String id : allid) {
		driver.switchTo().window(id);
	   String title = driver.getTitle();
	   System.out.println(title);
		
	}
	driver.findElement(By.name("identifier")).sendKeys("ams");

	}

}
