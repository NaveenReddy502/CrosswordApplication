package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crosswordsearch {

	WebDriver driver;
	
	//enter and click products name in searchbar
	@FindBy(id = "search-input")
	WebElement enter;
	
	public Crosswordsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	//To enter product name and entered
	public void Crossword_search() {
		enter.sendKeys("urban-naxals");
		enter.click();
		}
}
