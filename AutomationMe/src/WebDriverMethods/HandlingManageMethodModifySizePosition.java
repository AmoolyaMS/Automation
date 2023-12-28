package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingManageMethodModifySizePosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//set size and position
		driver.manage().window().setPosition(new Point(366, 170));
		driver.manage().window().setSize(new Dimension(200, 300));
		Thread.sleep(2000);
		//to get size and dimension value
		Point p = driver.manage().window().getPosition();
		Dimension d = driver.manage().window().getSize();
		int x = p.getX();
		int y = p.getY();
		int h = d.getHeight();
		int w = d.getWidth();
		System.out.println("axies are: "+x+" "+y);
		System.out.println("size are: "+h+" "+w);
		driver.get("https://www.fb.com");
		

	}

}
