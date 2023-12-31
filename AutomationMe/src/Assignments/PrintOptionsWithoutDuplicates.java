package Assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsWithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		List<WebElement> allc = s1.getOptions();
		Set<String> ts = new HashSet<>();
		for (int i = 0; i < allc.size(); i++) {
			String text = allc.get(i).getText();
			ts.add(text);
		}
		for (String s : ts) {
			System.out.println(s);
		}
		

	}

}
