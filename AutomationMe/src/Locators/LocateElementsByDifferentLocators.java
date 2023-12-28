package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByDifferentLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/linklocator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("l2")).click();
		driver.navigate().back();
		driver.findElement(By.name("link2")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Face")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[id='l1']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a)[2]")).click();
		

	}

}
