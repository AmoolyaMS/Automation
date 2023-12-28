package DemoForTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	@Test
	public void verifytitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String atitle = driver.getTitle();
		String etitle = "Googly";
		if (atitle.equals(etitle)) {
			System.out.println("pass");
		} else {
System.out.println("fail");
		}
		
	}
	

}
