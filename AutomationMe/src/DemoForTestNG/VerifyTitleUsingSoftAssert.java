package DemoForTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleUsingSoftAssert {
	@Test
	public void verifytitleSoftAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String atitle = driver.getTitle();
		String etitle = "Googly";
		SoftAssert s=new SoftAssert();
		s.assertEquals(atitle, etitle);
		s.assertAll();
		System.out.println(atitle);
		driver.quit();
		//s.assertAll();
}}
