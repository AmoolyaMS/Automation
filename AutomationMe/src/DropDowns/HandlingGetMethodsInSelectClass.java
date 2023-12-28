package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingGetMethodsInSelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		Select s2=new Select(city);
		//deselect all selected options
		//s1.deselectAll();
		//get all selected options
		List<WebElement> allselectcity = s2.getAllSelectedOptions();
		for (WebElement ci : allselectcity) {
			String allcity = ci.getText();
			System.out.println(allcity);	
		}
		//getonly 1st selected option
		WebElement firstlang = s1.getFirstSelectedOption();
		System.out.println(firstlang.getText());
		//all options wrapped in a single webelement and rtn the wrapped options
		WebElement alllang = s1.getWrappedElement();
		System.out.println(alllang.getText());
		//to check weather the drop down is multiselect or singleselect
		if (s2.isMultiple()) {
			System.out.println("multiselect dropdown");	
		}
		else {
			System.out.println("singleselect dropdown");	
		}
		s2.deselectAll();
	}

}
