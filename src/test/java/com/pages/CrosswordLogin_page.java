package com.pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrosswordLogin_page {
	
	
	WebDriver driver;
	
	//to click on login option
	@FindBy(xpath = "//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")
	WebElement login;
	
	//to enter email
	@FindBy(xpath = "//*[@id=\"user_session_email\"]")
	WebElement uemail  ;

	//to enter password
	@FindBy(xpath = "//*[@id=\"user_session_password\"]")
	WebElement userpassword;
	
	//to click on login button to login
	@FindBy(xpath = "//*[@id=\"user_session_submit\"]")
	WebElement submit;
	
	public CrosswordLogin_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// to click login portal page
	public void Crosswordlogin_loginportal() {
		login.click();
		
	}
	// to enter email in username portal
	public void Crosswordlogin_username(String email) {
		uemail.sendKeys(email);
		

	}
	//to enter password in password portal
	public void Crosswordlogin_password(String pass) {
		userpassword.sendKeys(pass);
		

	}
	//To submit login button
	public void Crosswordlogin_submit() {
		submit.click();
		
	}

}