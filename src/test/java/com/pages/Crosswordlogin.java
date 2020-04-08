package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crosswordlogin {


WebDriver driver;

//to click on login option
@FindBy(xpath = "//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")
WebElement login;

//to enter email
@FindBy(xpath = "//*[@id=\"user_session_email\"]")
WebElement email  ;

//to enter password
@FindBy(xpath = "//*[@id=\"user_session_password\"]")
WebElement password;

//to click on login button to login
@FindBy(xpath = "//*[@id=\"user_session_submit\"]")
WebElement submit;

public Crosswordlogin(WebDriver driver) {
PageFactory.initElements(driver, this);
}

// clicked on login icon
public void Crosswordlogin_login() {
login.click();
}
//entered email id in the field
public void Crosswordlogin_username(String userid) {
email.sendKeys(userid);
}

//entered password in the field
public void Crosswordlogin_gpassword(String userpassword) {
password.sendKeys(userpassword);
}

//clicked login button
public void Crosswordlogin_submit() {
submit.click();


}

}