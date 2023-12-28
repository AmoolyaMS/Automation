package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
		//cascade style sheet to get css properties like colour,font size,style
		String co = ele.getCssValue("color");
		System.out.println(co);
		String siz = ele.getCssValue("font-size");
		System.out.println(siz);

	}

}
