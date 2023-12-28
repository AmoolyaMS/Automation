package PopUps;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/cv.html");
		File f=new File("./data/resume.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);

	}

}
