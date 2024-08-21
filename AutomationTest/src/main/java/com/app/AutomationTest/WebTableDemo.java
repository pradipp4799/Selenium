package com.app.AutomationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> rowElements=driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		System.out.print(rowElements.size());
		List<WebElement> columnElements=driver.findElements(By.xpath("//*[@id='countries']/tbody/tr[1]/td"));
		System.out.println(columnElements.size());
		for(int i=1;i<rowElements.size();i++) {
			for(int j=1;j<columnElements.size();j++) {
				System.out.println(driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
	}
}
