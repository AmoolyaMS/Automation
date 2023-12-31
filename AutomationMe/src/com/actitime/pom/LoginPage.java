package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untxb;
	@FindBy(name="pwd")
	private WebElement pwdtxb;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//business logic method
	public void login(String un,String pwd)
	{
		untxb.sendKeys(un);
		pwdtxb.sendKeys(pwd);
		loginbtn.click();
	}

}
