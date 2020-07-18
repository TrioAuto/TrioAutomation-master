package com.his.src.util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.his.src.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMLICIT_WAIT=40;
	
	
	public static int getRandomNum(int min, int max) {
	    return new Random().nextInt((max - min) + 1) + min;
	  } 
	public static void takeScreenshotAtEndOfTest1() throws IOException {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		FileUtils.copyFile(srcFile, new File(currentDir +"/screenshots/" +System.currentTimeMillis()+".png"));
		
	}
}
