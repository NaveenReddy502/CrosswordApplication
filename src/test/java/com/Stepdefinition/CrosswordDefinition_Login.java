package com.Stepdefinition;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.excelutility.ExcelUtility;
import com.pages.CrosswordLogin_page;
import com.seleniumutility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;





public class CrosswordDefinition_Login extends Library {
	CrosswordLogin_page LOGIN;
	Utility util;
	ExcelUtility excel;
	final static Logger LOG = LogManager.getLogger(CrosswordDefinition_Login.class.getName());
	
	//to launch the browser
	@Given("^The Crossword page is opened$")
	public void the_Crossword_page_is_opened() throws IOException {
		launchApp();	
		LOG.info("Browser opened sucessfully");
	}
	
	//to click on login option
	@Then("^Login page is opened$")
	public void login_page_is_opened() {
		LOGIN = new CrosswordLogin_page(driver);
		LOGIN.Crosswordlogin_loginportal();
		LOG.info("Login opened sucessfully");
	}
	
	//to give details in the required field
	@Then("^The <email> and <password> details are given$")
	public void the_email_and_password_details_are_given() throws Throwable {
	   excel = new ExcelUtility();
	   LOGIN.Crosswordlogin_username(excel.excel_username(1));
	   LOGIN.Crosswordlogin_password(excel.excel_userpassword(1));
	   LOG.info("username and password opened sucessfully");
	}

	//to take screenshot and close the browser
	@Then("^Close browser and quit$")
	public void close_browser_and_quit() {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Screenshot\\multiplelogin.png");
		LOG.info("screenshot taken sucessfully");
		driver.quit();
		LOG.info("Browser closed sucessfully");
	}

}
