package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordToys {

	
	WebDriver driver;
	
	//clicks Toys link
		@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[2]/nav/div[2]/ul/li[4]/a")
		WebElement toys;

		
		//clicks on toys and games
		@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div/div/div/div[2]/ul/li[2]/div[3]/div[1]/ul/li[2]/a")
		WebElement games;
		
		public CrosswordToys(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}

		//To click on toys section
			public void Crossword_Toys() {
			toys.click();
			
			}
			//To click on Toys and games section
			public void crossword_Toysandgames() {
			games.click();
			}


}
