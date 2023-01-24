package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='login_email']")
	private WebElement user;

	@FindBy(xpath = "//input[@id='login_password']")
	private WebElement pass;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement signin;

	@FindBy(xpath = "(//button[@name='button'])[1]")
	private WebElement cookies;
	
	
	public Login(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getCookies() {
		return cookies;
	}
}
