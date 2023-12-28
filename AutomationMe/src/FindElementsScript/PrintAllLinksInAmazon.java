package FindElementsScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int c = alllinks.size();
System.out.println(c);
////		for (int i = 0; i < c; i++) {
////			String link = alllinks.get(i).getText();
////			System.out.println(link);
////		}
for (WebElement ele : alllinks) {
	String value = ele.getAttribute("href");
	System.out.println(value);
}
////Iterator<WebElement> i = alllinks.iterator();
////while (i.hasNext()) {
////	WebElement ele = i.next();
////	String link = ele.getText();
////	System.out.println(link);
////}

	}

}
