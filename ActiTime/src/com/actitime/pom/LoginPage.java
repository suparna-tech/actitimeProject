package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement Untbx;
@FindBy(name="password")
private WebElement Pwtbx;
@FindBy(xpath="//div[text()='Login ']")
private WebElement Lgbtn;

public void setLogin(String un,String pwd) {
	Untbx.sendKeys(un);
	Pwtbx.sendKeys(pwd);
	Lgbtn.click();
}
public LoginPage(WebDriver driver){

PageFactory.initElements(driver, this);	
}
}