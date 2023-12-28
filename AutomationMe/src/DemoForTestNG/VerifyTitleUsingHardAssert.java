package DemoForTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleUsingHardAssert {
	@Test
	public void verifytitleHardAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String atitle = driver.getTitle();
		String etitle = "Googly";
		Assert.assertEquals(atitle, etitle);
		System.out.println(atitle);
		driver.quit();
}}
