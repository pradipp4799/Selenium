package com.app.AutomationTest;

import java.time.Duration;

import org.openqa.selenium.By;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class App 

{
	public static String browser="chrome";
	public static WebDriver driver;
    public static void main( String[] args )
    {
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

        driver.get("https://www.saucedemo.com");
     //   driver.findElement(By.className("form_input")).sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        driver.findElement(with(By.tagName("input")).above(password)).sendKeys("standard_user");
        
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
     //   driver.close();
       System.out.println("hello");
    }
}
