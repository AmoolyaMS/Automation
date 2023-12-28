package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement draggable = driver.findElement(By.className("draghandle"));
		WebElement target = driver.findElement(By.id("column-2"));
		Actions a=new Actions(driver);
		a.dragAndDrop(draggable,target).release().perform();
		WebElement drag = driver.findElement(By.className("draghandle"));
		WebElement tar = driver.findElement(By.id("column-3"));
		Thread.sleep(2000);
		a.clickAndHold(drag).pause(1000).moveToElement(tar).pause(1000).release().build().perform();
	}

}
