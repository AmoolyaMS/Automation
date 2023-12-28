package FindElementsScript;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNmeAndPrice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
 List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]//..//../div[2]/div[1]"));
	for (int i = 0; i < name.size(); i++) {
		String nam = name.get(i).getText();
		String p = price.get(i).getText();
		System.out.println("name of mobile: "+nam+"price: "+p);
	}}

}
