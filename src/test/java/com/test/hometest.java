package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.pages.loginpom;
import com.utility.BaseClass;

public class hometest extends BaseClass {

	
	
	@Test
	public void hometest() throws InterruptedException {
		
		loginpom login=PageFactory.initElements(driver, loginpom.class);
		login.getUsername().sendKeys("123456");
		login.getPassword().sendKeys("654123");
		Thread.sleep(1000);
		login.getLogbutton().click();
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		WebElement Amount=driver.findElement(By.xpath("//th[@id='amount']"));
		act.moveToElement(Amount).click(Amount).build().perform();
		
	}
	
}
