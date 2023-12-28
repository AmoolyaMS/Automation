package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingQuitCloseGetTitleGetUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//to get title of current webpage
	    String atitle = driver.getTitle();
	    String etitle = "google";
	    //toget url of current webpage
	    String aurl = driver.getCurrentUrl();
	    String eurl = "https://www.google.com";
	    System.out.println(aurl);
	    if (atitle.equalsIgnoreCase(atitle)&&aurl.equalsIgnoreCase(eurl)) {
	    	System.out.println("title and url are matching");
			
		}
	    else {
	    	System.out.println("title and url  are not matching");
	    }
	    //to close current webpage
driver.close();
	}

}
