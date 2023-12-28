package HandlingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnActiTimeWithPropertyAndExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
p.load(fis);
String url = p.getProperty("url");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
driver.get(url);
FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis1);
int c = wb.getSheet("invalidlogin").getLastRowNum();
for (int i = 1; i <=c; i++) {
	String un = wb.getSheet("invalidlogin").getRow(i).getCell(0).getStringCellValue();
	String pwd = wb.getSheet("invalidlogin").getRow(i).getCell(1).getStringCellValue();
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	try {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("Logout")).click();
		wb.getSheet("invalidlogin").getRow(i).getCell(2).setCellValue("pass");
		
	} catch (Exception e) {
		wb.getSheet("invalidlogin").getRow(i).getCell(2).setCellValue("fail");
	}

	
}
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
	}

}
