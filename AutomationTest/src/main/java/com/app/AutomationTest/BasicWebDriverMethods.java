package com.app.AutomationTest;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {
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

       driver.get("https://www.saucedemo.com");
       driver.manage().window().maximize();
       String currentUrl=driver.getCurrentUrl();
       System.out.println(currentUrl);
        String title=driver.getTitle();
         System.out.println(title);
       
       String pageSource=driver.getPageSource();
       System.out.println(pageSource);
       
    //   driver.navigate().to("http://google.com");
       WebElement password=driver.findElement(By.id("password")); 
       driver.findElement(with(By.tagName("input")).above(password)).sendKeys("standard_user");
       
       driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
      
       List<WebElement> webElements=driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
       System.out.println(webElements);
       driver.navigate().to("https://www.sugarcrm.com/");
  //     driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
      Set< String> windowhandle=driver.getWindowHandles();
       
       System.out.println(windowhandle);
       driver.close();
       
       
       
	}

}
