package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
		driver.findElement(By.id("browNotButton")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);


	}

}
