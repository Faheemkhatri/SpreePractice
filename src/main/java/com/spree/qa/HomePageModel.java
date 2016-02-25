package com.spree.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel {
	
	
	protected WebDriver driver = null;
	public HomePageModel(WebDriver driver){
		this.driver = driver;
	}
	
	public void searchField(){
		
		WebElement searchText = driver.findElement(By.xpath(".//*[@id='keywords']"));
		searchText.sendKeys("Bag");
		WebElement searchButton = driver.findElement(By.xpath(".//*[@class='btn btn-success']"));
		searchButton.click();
		
	}
	



}
