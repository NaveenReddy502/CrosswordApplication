package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.Crosswordlogin;
import com.pages.Crosswordsearch;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Crosswordstepsearch extends Library {

Crosswordsearch log;
	
	Utility util;
	final static Logger LOG = LogManager.getLogger(Crosswordstepsearch.class.getName());
	
// To enter Crossword home page opened
	@Given("^I lanuch$")
	public void i_lanuch() throws Throwable {
		launchApp();
	    LOG.info("Crossword page opened");
	}

//  To enter product names in search bar atCrossword
	@Then("^enter the product name in searchbar$")
	public void enter_the_product_name_in_searchbar() throws Throwable {
	    log = new Crosswordsearch(driver);
	    log.Crossword_search();
	    LOG.info("Product name entered in searchbar");
	}

	
	//to take screenshot
	@Then("^shoot picture$")
	public void shoot_picture() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Screenshot\\CrosswordSearchresult.png");
		LOG.info("Screenshot taken");
	}

	//To close the browser
	@Then("^close the browser$")
		public void close_the_browser() {
			driver.quit();
			LOG.info("Crossword page closed");

	}	
}


