package FindElementsScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlPrentInSearchPage {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
	driver.get("https://www.google.com");
	List<WebElement> urls = driver.findElements(By.tagName("a"));
	System.out.println(urls.size());
	for (WebElement ele : urls) {
		String value = ele.getAttribute("href");
		System.out.println(value);
	}

}}
