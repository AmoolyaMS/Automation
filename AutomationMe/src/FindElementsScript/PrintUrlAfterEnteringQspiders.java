package FindElementsScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUrlAfterEnteringQspiders {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
		List<WebElement> url = driver.findElements(By.xpath("//a[@href]"));
		System.out.println(url.size());
		for (WebElement ele : url) {
			String value = ele.getAttribute("href");
			System.out.println(value);
		

		}}

}
