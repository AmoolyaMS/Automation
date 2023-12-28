package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		s1.selectByValue("M");
		s1.selectByIndex(2);
		s1.selectByVisibleText("kannada");
		//deselect options vis index.attribute value,tagtext
		s1.deselectByValue("M");
		s1.deselectByIndex(2);
		s1.deselectByVisibleText("kannada");

	}

}
