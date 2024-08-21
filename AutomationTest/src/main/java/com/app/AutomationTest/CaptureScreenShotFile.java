package com.app.AutomationTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShotFile {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		File screenShotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screenShotFile, new File(".//screenshot/screen.png"));
         
	}

}
