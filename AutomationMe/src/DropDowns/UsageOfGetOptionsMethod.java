package DropDowns;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptionsMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		Select s2=new Select(city);
		List<WebElement> alllang = s1.getOptions();
//		for (int i = 0; i < alllang.size(); i++) {
//			System.out.println(alllang.get(i).getText());
//		}
//		for (WebElement eachlang : alllang) {
//			System.out.println(eachlang.getText());
//			
//		}
		Iterator<WebElement> i = alllang.iterator();
		while (i.hasNext()) {
			WebElement eachlang = i.next();
			System.out.println(eachlang.getText());
			
		}
		

	}

}
