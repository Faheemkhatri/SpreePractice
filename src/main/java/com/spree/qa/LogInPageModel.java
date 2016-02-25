package com.spree.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogInPageModel {
	
	protected WebDriver driver = null;
	
	public LogInPageModel(WebDriver driver){
		this.driver = driver;
	}
	
	public void logIn(String email,String password){
		WebElement logInLink = driver.findElement(By.id("link-to-login"));
		logInLink.click();
		WebElement emailField = driver.findElement(By.id("spree_user_email"));
		emailField.sendKeys(email);
		WebElement passwordField = driver.findElement(By.id("spree_user_password"));
		passwordField.sendKeys(password);
		WebElement checkBox = driver.findElement(By.xpath(".//*[@id='spree_user_remember_me']"));
		checkBox.click();
		WebElement logInButton = driver.findElement(By.name("commit"));
		logInButton.click();
	}
	public void verifyAccount(){
		
		WebElement accountLink = driver.findElement(By.xpath("//li/a[text()='My Account']"));
		accountLink.click();
		WebElement verifyEmail = driver.findElement(By.xpath(".//*[@id='user-info']/dd"));
		String textEmail = verifyEmail.getText();
		Assert.assertEquals(textEmail, "akhatrifahim@gmail.com (Edit)");
		WebElement logOutLink = driver.findElement(By.linkText("Logout"));
		logOutLink.click();
		WebElement signOutText = driver.findElement(By.xpath(".//*[@class='alert alert-notice' and text()='Signed out successfully.']"));
		String signOutMessage = signOutText.getText();
		Assert.assertEquals(signOutMessage, "Signed out successfully.");
	}

}
