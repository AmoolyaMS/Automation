package DemoForTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageDemo {
//declaration
	private WebElement untb;
	private WebElement pwdtxb;
	private WebElement loginbtn;
	//initialization
	public LoginPageDemo (WebDriver driver)
	{
		untb=driver.findElement(By.id("username"));
		pwdtxb=driver.findElement(By.name("pwd"));
		loginbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	//utilization
	public void login(String un,String pwd)
	{
		untb.sendKeys(un);
		pwdtxb.sendKeys(pwd);
		loginbtn.click();
	}
}
