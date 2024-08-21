package com.app.AutomationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
	
	     WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
		    
		
	       driver.get("https://www.sugarcrm.com/au/request-demo/");
		       driver.manage().window().maximize();	       
	       driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
          List<WebElement> allTags=driver.findElements(By.tagName("a"));   	   
          System.out.println("Total tags are: "+allTags.size());
          
          for(int i=0;i<allTags.size();i++) {
        	  System.out.println("Link on page are "+allTags.get(i).getAttribute("href"));
        	  System.out.println("Links on page are"+allTags.get(i).getText());
          }
	}

}
