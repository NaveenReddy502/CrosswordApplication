package com.seleniumutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseclass.Library;

public class Utility {
WebDriver driver;

public Utility(WebDriver driver) {
this.driver = driver;
}
public void takeSnapShot(String path1)
{
TakesScreenshot screenshot = (TakesScreenshot)driver;
File Source = screenshot.getScreenshotAs(OutputType.FILE);

try {
FileUtils.copyFile(Source, new File(path1));
} catch (IOException e) {
e.printStackTrace();
}
}

}