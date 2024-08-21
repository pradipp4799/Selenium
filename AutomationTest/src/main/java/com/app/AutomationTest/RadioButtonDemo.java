package com.app.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.singaporeair.com/en_Uk/au/home#/book/bookflight");
		driver.manage().window().maximize();
		WebElement radio2=driver.findElement(By.xpath("//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/label"));
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"bookFlights\"]"));
		Thread.sleep(2000);
	     radio2.click();
		//System.out.println(radio2.isSelected());
		//System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
		//driver.close();

	}

}
