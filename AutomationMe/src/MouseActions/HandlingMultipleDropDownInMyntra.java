package MouseActions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleDropDownInMyntra {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.myntra.com");
		List<WebElement> allele = driver.findElements(By.className("desktop-navContent"));
		Actions a=new Actions(driver);
		int c = allele.size();
//		for (int i = 0; i < c; i++) {
//			WebElement ele = allele.get(i);
//			a.moveToElement(ele).pause(1000).perform();
//			
//		}
		for (WebElement ele : allele) {
			a.moveToElement(ele).pause(1000).perform();
			
		}
//		ListIterator<WebElement> i = allele.listIterator(6);
//		while (i.hasPrevious()) {
//			WebElement Ele = i.previous();
//			a.moveToElement(Ele).pause(1000).perform();
//			
//		}
		for (int i =c-1 ; i >=0; i--) {
			WebElement ele1 = allele.get(i);
		a.moveToElement(ele1).pause(1000).perform();
			
		}

	}

}
