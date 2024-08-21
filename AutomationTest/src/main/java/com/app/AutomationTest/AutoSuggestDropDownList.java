package com.app.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownList {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
	    	
	    	driver.get("https://www.makemytrip.com/");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	    	
	    	Thread.sleep(2000);
	    	
	    	WebElement inputForm=driver.findElement(By.xpath("//input[@placeholder='From']"));
	    	
	    	inputForm.sendKeys("Sydney");
	    	Thread.sleep(2000);
	    	inputForm.sendKeys(Keys.ARROW_DOWN);
	    	inputForm.sendKeys(Keys.ENTER);
	    	
	    	WebElement date=driver.findElement(By.xpath("//INPUT[@DATA-CY='departure']"));
	    	Thread.sleep(2000);
	    	date.click();
	    	date.sendKeys("13052023");
	    	date.submit();
	    	
	    	System.out.println("End");
	    	
	    	

	}

}
