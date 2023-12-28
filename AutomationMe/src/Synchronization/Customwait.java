package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("9972566747");
		driver.findElement(By.name("password")).sendKeys("#ammu310");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		for (int i = 0; i <50; i++) {
			try {
				driver.findElement(By.xpath("//button[text()='logout']")).click();
				break;
			} catch (Exception e) {
				System.out.println(i);
			}
		
		}
		
	}

}
