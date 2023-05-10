package com.utilities;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class ScreenShotUtility {
	WebDriver driver;
	
	@After (order = 1)

	public void ScreenShotOnFailure() throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File target=new File(".\\screenshots.png");
	FileUtils.copyFile(src, target);
}
}