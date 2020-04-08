package com.Stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Crosswordlogin;
import com.seleniumutility.Utility;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrosswordLoginstep extends Library {

	
	Crosswordlogin login;
	
	Utility util;
	final static Logger LOG = LogManager.getLogger(CrosswordLoginstep.class.getName());
	
	//to Crossword home page opened
@Given("^I launch Chrome browser$")
public void i_launch_Chrome_browser() throws IOException {
	launchApp();
	LOG.info("Browser opened sucessfully");  
}

//To crossword login page opened
@When("^Login Crossword login page opened$")
public void login_Crossword_login_page_opened() throws IOException {
	login =new Crosswordlogin(driver);
	login.Crosswordlogin_login();
	LOG.info("crossword login sucessfully");
}

//To enter username and password
@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"")
public void i_enter_username_and_password(String email, String password)
{
	login =new Crosswordlogin(driver);
	login.Crosswordlogin_username(email);
	login.Crosswordlogin_gpassword(password);
	LOG.info("username and password entered sucessfully");
}

//to submit login button
@Then("^clicks the login button$")
public void clicks_the_login_button() throws IOException {
	login =new Crosswordlogin(driver);
	login.Crosswordlogin_submit();
	LOG.info("login sucessfully");
}

//To take screenshot
	@Then("^takes a screenshot$")
	public void takes_a_screenshot() throws IOException  {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Screenshot\\Crosswordloginpage.png");
		LOG.info("screenshot taken sucessfully");
	}
}
	    