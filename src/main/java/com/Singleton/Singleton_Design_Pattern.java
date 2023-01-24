package com.Singleton;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Login;
import com.Page_Object_Model.Signup_pom;

public class Singleton_Design_Pattern {

	public WebDriver driver;
	
	private Login log;
	private Signup_pom sgn_up;
	
	
	public Singleton_Design_Pattern(WebDriver driver2) {
      this.driver =  driver2;
	
	}
	
	public Login getInstanceLog() {
		log = new Login(driver);
		return log;
	}
	public Signup_pom getInstanceSgn_up() {
		sgn_up = new Signup_pom(driver);
		return sgn_up;
	}
	
	
	
	
}
