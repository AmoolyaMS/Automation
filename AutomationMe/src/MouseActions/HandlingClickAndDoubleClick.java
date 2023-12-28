package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingClickAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://demoapps.qspiders.com/button");
		WebElement click = driver.findElement(By.linkText("Double Click"));
		Actions a=new Actions(driver);
		a.click(click).perform();
		Thread.sleep(1000);
		WebElement dclick = driver.findElement(By.id("btn23"));
		a.doubleClick(dclick).perform();
		String text = driver.findElement(By.xpath("//p[contains(text(),'Do you have any')]//../span")).getText();
		System.out.println(text);
		

	}

}
