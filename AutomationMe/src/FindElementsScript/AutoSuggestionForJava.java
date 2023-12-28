package FindElementsScript;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionForJava {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
int c=sugg.size();
System.out.println(c);
//for (int i = 0; i < c; i++) {
//	String text = sugg.get(i).getText();
//	System.out.println(text);
//}
for (WebElement ele : sugg) {
	System.out.println(ele.getText());
}
//ListIterator<WebElement> i = sugg.listIterator();
//while (i.hasNext()) {
//	WebElement ele = i.next();
//	System.out.println(ele.getText());
//	
//}
	}

}
