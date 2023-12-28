package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownInDifferentFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://jqueryui.com");
driver.findElement(By.linkText("Droppable")).click();
//driver.switchTo().frame(0);

WebElement ele = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
driver.switchTo().frame(ele);
WebElement dragable = driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));

Actions a=new Actions(driver);
a.dragAndDrop(dragable, target).pause(1000).perform();
	}

}
