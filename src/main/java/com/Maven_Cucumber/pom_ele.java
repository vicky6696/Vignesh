package com.Maven_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_ele {
public static WebDriver driver;
	
	@FindBy(id="username") 
		private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public pom_ele(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver = driver2;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
