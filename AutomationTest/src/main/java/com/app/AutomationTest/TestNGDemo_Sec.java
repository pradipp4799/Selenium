package com.app.AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo_Sec {
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		SoftAssert softassert=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	    String exceptedstr="Automation Practice | WebTable – CosmoCode (Formerly TeachMeSelenium)";
		String actualstr=driver.getTitle();
		System.out.println(actualstr);
     	softassert.assertEquals(actualstr,exceptedstr);
     	softassert.assertAll();     	
     	
	}

}
