package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingisdisplayisenableMethod {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@disabled]"));
		if(ele.isDisplayed())
		{System.out.println("login button is displayed");}
		else{
			System.out.println("login button is not displayed");}
		if (ele.isEnabled()) {
			System.out.println("loginbutton is enabled");
			} else {
			System.out.println("disable");
		}}}
