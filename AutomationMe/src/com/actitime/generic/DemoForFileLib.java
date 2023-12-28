package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForFileLib {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url = f.readFromProperty("url");
		String un = f.readFromProperty("username");
		String pwd = f.readFromProperty("pwd");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

}
