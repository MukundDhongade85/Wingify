package com.test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.pages.loginpom;
import com.utility.BaseClass;


public class loginTest extends BaseClass {
	
	@Test
	public void logintest() throws Exception {
		
	loginpom login=PageFactory.initElements(driver, loginpom.class);
	login.getUsername().sendKeys("123456");
	Thread.sleep(1000);
	login.getPassword().sendKeys("654123");
	Thread.sleep(1000);
	login.getCheckbox().click();
	Thread.sleep(1000);
	login.getLogbutton().click();
	Thread.sleep(1000);
	System.out.println("User Successfully Login");	
	
	}
	
	
}
