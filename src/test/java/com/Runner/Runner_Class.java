package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_File", glue = "com.Step_Def",

		monochrome = true, dryRun = false, strict = true,

		plugin = { "html:Report/HtmlReport", "pretty", "json:JansonReport/Report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" },

		tags = { "@Signup" }

)

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.get_Driver();
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();

	}

}
