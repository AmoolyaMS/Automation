package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGetLocationMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ele1 = driver.findElement(By.id("email"));
		WebElement ele2 = driver.findElement(By.id("passContainer"));
		Point p = ele1.getLocation();
		int x1 = p.getX();
		int x2 = ele2.getLocation().getX();
		if(x1==x2)
		{
			System.out.println("both text boxes are alligned");
		}else
		{
			System.out.println("not alligned");
		}

	}
}
