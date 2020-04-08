package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrossWordGifts {

	WebDriver driver;
	
	//Xpath of  gifts link
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div/div[2]/nav/div[2]/ul/li[5]/a")
	WebElement gifts;

	
	//Xpath of  books link
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div/div[2]/ul/li[2]/h5[1]/a")
	WebElement books;
	

public CrossWordGifts(WebDriver driver) {
PageFactory.initElements(driver, this);
}

// This will used to click the gifts page
public void Crossword_giftspage() {
gifts.click();

}
// This will used to click the Books page in gifts page
public void Crossword_bookspage() {
books.click();

}




}
