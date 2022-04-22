package com.StepDefinition;

import org.baseclass.Base_class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Maven_Cucumber.pom_ele;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class Adacs_cod extends Base_class {

	public static WebDriver driver = Base_class.Browserlaunch();
	
	pom_ele p = new pom_ele(driver);
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    GetURL("https://adactinhotelapp.com/");
		
	}
	
	@When("user gives the valid username and password")
	public void user_gives_the_valid_username_and_password() {
		/* Sendkeys(p.getUsername(),); */
		System.out.println("jkhkdc");	
	   	}
	@Ignore
	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
		System.out.println("kasib");
	    
	}
	@Then("user should be able to see the next page")
	public void user_should_be_able_to_see_the_next_page() {
		System.out.println("nnaos");
	    
	}

}
