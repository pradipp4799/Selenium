package com.app.AutomationTest;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElement {
	public static String browser="chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		if(browser.equals("Firefox")) {
	   		 WebDriverManager.firefoxdriver().setup();
	   	     driver=new FirefoxDriver();
	   	}
	   	else if(browser.equals("chrome")) {
	   	     WebDriverManager.chromedriver().setup();
	   	    	 driver=new ChromeDriver();
	   	}
	   	else if(browser.equals("edge")) {
	   		WebDriverManager.edgedriver().setup();
	   		driver=new EdgeDriver();
	   		
	   	}

	       driver.get("https://www.sugarcrm.com/au/request-demo/");
           driver.manage().window().maximize();
	       
	      driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
	      driver.findElement(By.name("email")).sendKeys("pp398984@gmail.com");
	   // driver.findElement(By.name("email")).clear();
	      System.out.println(driver.findElement(By.name("email")).getAttribute("name"));
	      
	       
	

	}

}
