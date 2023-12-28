package DemoForTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pom.LoginPage;

public class LogInToActitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
	
		l.login("admin", "manager");
		Thread.sleep(1000);
		driver.navigate().back();
		l.login("admi", "manager");
	}

}
