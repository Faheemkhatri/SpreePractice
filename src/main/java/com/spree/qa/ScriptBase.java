package com.spree.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ScriptBase {
	
	protected WebDriver driver = null;
	protected HomePageModel homePage = null;
	protected LogInPageModel logInPage = null;
	
	@BeforeMethod
	public void setUp(){
		
		driver = new FirefoxDriver();
		homePage = new HomePageModel(driver);
		logInPage = new LogInPageModel(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.navigate().to("http://spree.paxotech.com/");
		
	}

	
	@AfterMethod
	public void tearDown(){
		
		//driver.close();
		//driver.quit();
		
	}
}


