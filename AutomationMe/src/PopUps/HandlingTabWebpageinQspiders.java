package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabWebpageinQspiders {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/browser?sublist=3");
		driver.findElement(By.linkText("Multiple Tabs")).click();
		driver.findElement(By.id("browserButton2")).click();
	Set<String> allid = driver.getWindowHandles();
	for (String id : allid) {
		driver.switchTo().window(id);
	   String title = driver.getTitle();
	   System.out.println(title);
	   Thread.sleep(1000);
	   driver.close();
	}
	}
}
