package com.Base_Class;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver get_Driver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void Inputvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
	

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void close() {
		driver.close();
	}

	public static void waitForSeconds(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}

	public static void actionsMethod(WebElement move) {
		Actions act = new Actions(driver);
		act.moveToElement(move).build().perform();

	}
	public void actionsClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);

	}

	public static void frame_out() {
		driver.switchTo().defaultContent();

	}

	public static void Sleep(int a) throws InterruptedException {
		Thread.sleep(a);

	}

	public static void dropdownSelectByIndex(WebElement element, int getdata) {
		Select s = new Select(element);
		s.selectByIndex(getdata);
	}

	public void dropdownSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByVisibleText(a);
	}

	public void dropdownSelectByValue(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByValue(a);
	}

	public static void screenshot(String file) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);
	}

	public void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void jsclick(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", webElement);
	}
	public String gettext(List<WebElement> calender) {
		String text = ((WebElement) calender).getText();
		return text;

	}

}
