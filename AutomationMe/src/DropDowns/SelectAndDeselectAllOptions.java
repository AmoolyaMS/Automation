package DropDowns;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAllOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		Select s2=new Select(city);
		s1.deselectAll();
		List<WebElement> allc = s1.getOptions();
		int c=allc.size();
		System.out.println(c);
		for (WebElement eachct : allc) {
			String value = eachct.getAttribute("value");
			s1.selectByValue(value);
			Thread.sleep(1000);
		}
//		for (int i=c-1; i>=0; i--) {
//			String lan = allc.get(i).getText();
//			s1.deselectByVisibleText(lan);
//			Thread.sleep(1000);}
		ListIterator<WebElement> i = allc.listIterator(8);
		while (i.hasPrevious()) {
			WebElement ele=i.previous();
			String lan = ele.getAttribute("value");
			s1.deselectByValue(lan);
			Thread.sleep(1000);
		}
	}

}
