package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandalingTabs {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pib.gov.in/indexd.aspx");
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(05));
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
driver.findElement(By.linkText("Ministry of Commerce & Industry")).click();
driver.switchTo().alert().accept();
Set<String> allid = driver.getWindowHandles();
for (String id : allid) {
	driver.switchTo().window(id);
	System.out.println(driver.getTitle());
	}
	}
}
