package FindElementsScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetContentOfWebtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://demoapps.qspiders.com/table?scenario=1");
		List<WebElement> content = driver.findElements(By.tagName("td"));
		for (int i = 0; i < content.size(); i++) {
			String c = content.get(i).getText();
			System.out.print(" "+c+" ");
			if (i==3||i==7||i==11) {
				System.out.println();
				
			}
			
		}
	}

}
