package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGetSizeMethod {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			WebElement ele1 = driver.findElement(By.name("firstname"));
			WebElement ele2 = driver.findElement(By.name("lastname"));
			Dimension d1 = ele1.getSize();
			Dimension d2 = ele2.getSize();
			int h1 = d1.getHeight();
			int w1 = d1.getWidth();
			int h2 = d2.getHeight();
			int w2 = d2.getWidth();
			if((h1==h2)&&(w1==w2))
			{
				System.out.println("both text boxes are same size");
			}else
			{
				System.out.println("not same size");
			}

	}

}
