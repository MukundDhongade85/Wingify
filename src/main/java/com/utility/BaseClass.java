package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.loginpom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	public WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		    WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("https://sakshingp.github.io/assignment/login.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String ActualURL="https://sakshingp.github.io/assignment/login.html";
			String ExpectedURL=driver.getCurrentUrl();
			Assert.assertEquals(ActualURL, ExpectedURL);
		
	}
	
	@AfterMethod
	public void setup1() {
		
		driver.close();
	}
	
}
