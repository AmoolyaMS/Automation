package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrolling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.actitime.com/");
		WebElement scroll = driver.findElement(By.className("features__header"));
		Actions a=new Actions(driver);
		//a.scrollByAmount(0,40000).perform();
		a.scrollToElement(scroll).perform();
	}

}
