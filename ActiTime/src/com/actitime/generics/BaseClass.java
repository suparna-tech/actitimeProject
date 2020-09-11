package com.actitime.generics;


	

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import qsp.BaseSettings;

	public class BaseClass extends BaseSettings
	{
		 protected WebDriver driver=new ChromeDriver();
		public FileLib fb=new FileLib();
	@BeforeMethod
	public void login() throws IOException {
		String un=fb.getPropertyValue("username");
		String pwd=fb.getPropertyValue("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	
	@AfterMethod
	public void logout() {
	HomePage h=new HomePage(driver);
	h.setLogout();
	}

	}

