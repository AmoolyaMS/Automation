package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleDropDowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select s1=new Select(date);
		Select s2=new Select(month);
		Select s3=new Select(year);
		//by index perticular data will be selected
		s1.selectByIndex(2);
		//by attribute value perticular data will be selected
		s2.selectByValue("10");
		//by tagtext perticular data will be selected
		s3.selectByVisibleText("1991");
		//deselect methods only for multi select dropdowns
		//s1.deselectAll();unsupportedoperation exception
		

	}

}
