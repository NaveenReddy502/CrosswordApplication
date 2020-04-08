package com.Stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;

import com.pages.CrosswordToys;
import com.seleniumutility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrosswordStepToys extends Library {
	
CrosswordToys toy;
	
	Utility util;
	final static Logger LOG = LogManager.getLogger(CrosswordStepToys.class.getName());
	
	//To Crossword home page open
	@Given("^I launch Chrme bro$")
	public void i_launch_Chrme_bro() throws Throwable {
		launchApp();
	    LOG.info("Crossword home page opened");
	}
	
	//to enter into toys page
	@Then("^clicks on Toys$")
	public void clicks_on_Toys() throws Throwable {
	    toy = new CrosswordToys(driver);
	    toy.Crossword_Toys();
	    LOG.info("Toys page opened");
	}

	// to click on toys and games link
	@Then("^clicks on Toysgames$")
	public void clicks_on_Toysgames() throws Throwable {
	  toy = new CrosswordToys(driver);
	  toy.crossword_Toysandgames();
	  LOG.info("Toysandgames page opened");
	}
	
	// To click on toys and games link
	@Then("^takes a screenshot for toys$")
	public void takes_a_screenshot_for_toys() throws Throwable {
		util = new Utility(driver);
		util.takeSnapShot("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Screenshot\\CrosswordToys.png");
		LOG.info("Screenshot taken sucessfully");
	}
	
	
}
