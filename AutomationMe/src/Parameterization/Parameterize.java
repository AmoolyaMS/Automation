package Parameterization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterize {
	WebDriver driver;
	@Test
	@Parameters({"browser","url","un","pwd"})
	public void login(String b,String url, String un, String pwd) throws IOException
	{

		if (b.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}

		else  if (b.equals("edge"))
		{
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		IdNameXpathForParametrization i=new IdNameXpathForParametrization();
		String id = i.readDataFromLocatorsFile("id");
		String name = i.readDataFromLocatorsFile("name");
		String x = i.readDataFromLocatorsFile("xpath");
		driver.findElement(By.id(id)).sendKeys(un);
		driver.findElement(By.name(name)).sendKeys(pwd);
		driver.findElement(By.xpath(x)).click();
	}
}
