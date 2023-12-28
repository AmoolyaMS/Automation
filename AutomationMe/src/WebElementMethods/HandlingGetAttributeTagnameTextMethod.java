package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGetAttributeTagnameTextMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("login"));
		//to get tagname of an element
		String tag = ele.getTagName();
		System.out.println("tagname of login element:"+tag);
		//to get tagtext of an element,if text is not there den blank space will be displayed
		String tagtext = ele.getText();
		System.out.println("tagtext of login element:"+tagtext);
		//to get att value of att name in an element, if such att name is not thre then rtn NULL
		String value1 = ele.getAttribute("type");
		String value2 = ele.getAttribute("value");
		System.out.println("attributevalue of type attribute:"+value1);
		System.out.println("attributevalue of value attribute:"+value2);
		
	}

}
