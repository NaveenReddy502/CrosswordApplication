package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.CrossWordGifts;
import com.pages.Crosswordlogin;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordStepGifts extends Library {

CrossWordGifts gift;
	
	Utility util;
	
	final static Logger LOG = LogManager.getLogger(CrosswordStepGifts.class.getName());
    // This step for Crossword home page opened
	@Given("^I lanuch crome$")
	public void i_lanuch_crome() throws Throwable {
		launchApp();
	  
		LOG.info("Browser opened sucessfully");
	}

	  //This step for Gifts page opened
	@Then("^clicks Gifts$")
	public void clicks_Gifts() throws Throwable {
	    gift = new CrossWordGifts(driver);
	  gift.Crossword_giftspage();
	  
	  LOG.info("Gift page opened sucessfully");
	}

	//This step for Books page opened
	@Then("^clicks on Books$")
	public void clicks_on_Books() throws Throwable {
	    gift= new CrossWordGifts(driver);
	    gift.Crossword_bookspage();
	   
	    LOG.info("Books page opened sucessfully");
	}

	//This step for screenshot taken
	@Then("^takes a picture$")
	public void takes_a_picture() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Screenshot\\CrosswordGifts.png");
		
		LOG.info("screenshot taken sucessfully");
	}

}
