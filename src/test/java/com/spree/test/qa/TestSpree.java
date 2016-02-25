package com.spree.test.qa;

import org.testng.annotations.Test;


import com.spree.qa.ScriptBase;

public class TestSpree extends ScriptBase{
	
	@Test
	public void test1(){
		
	homePage.searchField();
	
	}
	
	@Test
	public void test2(){
		logInPage.logIn("akhatrifahim@gmail.com","student");
		logInPage.verifyAccount();
	}
	


}
