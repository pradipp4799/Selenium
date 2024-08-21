package com.app.UI;

import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		driver.close();

	}

}
