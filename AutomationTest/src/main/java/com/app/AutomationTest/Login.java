package com.app.AutomationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
  public void loginApp() {
	  System.out.println("longing Application");
  }

  @Test(priority = 1,description = "login for test execution")
	public void loginTest() {
		System.out.println("login has been succesfull");
		}
	@AfterTest
	  public void logoutApp() {
		  System.out.println("logout Application");
	  }
	@BeforeMethod
	public void beforMeth() {
		System.out.println("before login application");
	}
	@AfterMethod
	public void afterformeth() {
		System.out.println("after login application");
	}
  @Test(priority = 2,description = "logout for test execution")
  public void logoutTest() {
	  System.out.println("logout has been succesfull");
	  }
  
}
