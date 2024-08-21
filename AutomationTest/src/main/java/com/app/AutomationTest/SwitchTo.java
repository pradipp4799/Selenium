package com.app.AutomationTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
		    
		
	       driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_Prompt");
		       driver.manage().window().maximize();
		       //driver.switchTo().frame(0);
		     // driver.switchTo().frame("iframeResult");
		       WebElement frame=driver.findElement(By.id("iframeResult"));
		        driver.switchTo().frame(frame);
		     
		     driver.findElement(By.xpath("/html/body/button")).click();  
		     Alert alert=  driver.switchTo().alert();
		     
		   alert.sendKeys("pp");
             alert.accept();
             
          

	}

}
