package FindElementsScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxInQspiderDemoApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://demoapps.qspiders.com/checkbox?scenario=1&sublist=0");
List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
for (WebElement c : check) {
	c.click();
	
	
}
	}

}
