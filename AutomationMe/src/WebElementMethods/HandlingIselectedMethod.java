package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIselectedMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
        if (ele.isSelected())
        {
			System.out.println("check box is selected");
		}
        else
        {
        	System.out.println("check box is not selected");
        }
	}

}
