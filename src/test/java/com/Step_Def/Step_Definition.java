package com.Step_Def;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton.Singleton_Design_Pattern;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Singleton_Design_Pattern pom = new Singleton_Design_Pattern(driver);

	@Given("^user Launch The Browser$")
	public void user_Launch_The_Browser() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws InterruptedException {
		Inputvalues(pom.getInstanceLog().getUser(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws InterruptedException {
		try {
			Inputvalues(pom.getInstanceLog().getPass(), password);
		} catch (Exception e) {
		}
	
	}

	@When("^user click the accept cookies button$")
	public void user_click_the_accept_cookies_button() throws Throwable {
		try {
			clickOnElement(pom.getInstanceLog().getCookies());
		} catch (Exception e) {
		}

	}

	@Then("^user Click The Sigin button and Page Navigates to Home Page$")
	public void user_Click_The_Sigin_button_and_Page_Navigates_to_Home_Page() throws Throwable {
		clickOnElement(pom.getInstanceLog().getSignin());
	}
}
