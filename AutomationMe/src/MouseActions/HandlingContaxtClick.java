package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingContaxtClick {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.fb.com");
		WebElement rclick = driver.findElement(By.linkText("Forgotten password?"));
		Actions a=new Actions(driver);
		a.contextClick(rclick).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
	}

}
