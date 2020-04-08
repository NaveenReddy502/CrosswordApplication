package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Stepdefinition.CrosswordDefinition_Login;

public class Library {
	protected WebDriver driver;
	 Properties prop;
	 FileInputStream fis;

	 final static Logger LOG = LogManager.getLogger(Library.class.getName());
	 
	  public void launchApp() throws IOException {
	 //give the path of yours from config.property
	 fis = new FileInputStream("D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\configuration property\\config.property");
	   prop = new Properties();
	prop.load(fis);
	String browser = prop.getProperty("browser");
	 
	  try {
	  //for launching firefox browser
	  if(browser.equalsIgnoreCase("firefox")) {
	  driver = new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("chrome")) {
	  //for launching chrome browser
	  System.setProperty("webdriver.chrome.driver", "D:\\naveenreddy\\CrosswordDemoproject\\src\\test\\resources\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  LOG.info("chrome browser launched sucessfully");
	  }
	 
	 // to window to get maximize
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  LOG.info("Window maximized sucessfully");
	 
	  }catch(WebDriverException e) {
	  System.out.println("browser couldnot be launched");
	  }
	}
	 // to quit the browser
	  public void quit() {
	  driver.quit();
	  }
	}

	

