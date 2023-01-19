package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	
	
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@class='form-check-input']")
	private WebElement Checkbox;
	
	@FindBy(how=How.XPATH,using="//button[@id='log-in']")
	private WebElement Logbutton;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getLogbutton() {
		return Logbutton;
	}

	
	
	
	
	

}
