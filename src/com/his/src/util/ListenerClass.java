package com.his.src.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.his.src.base.TestBase;




public class ListenerClass extends TestBase implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
	
		System.out.println("Before the Alert accept" );
	}

	public void afterAlertAccept(WebDriver driver) {
		
		System.out.println("After the Alert accept" );
	}

	public void afterAlertDismiss(WebDriver driver) {
		
		System.out.println("After the Alert Dismiss" );
	}

	public void beforeAlertDismiss(WebDriver driver) {
		
		System.out.println("Before the Alert Dismiss" );
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigation to: ' "+url +" '" );
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		
		System.out.println("After navigation to: ' "+url +" '" );
	}

	public void beforeNavigateBack(WebDriver driver) {
		
		System.out.println("Navigating back to previous page" );
	}

	public void afterNavigateBack(WebDriver driver) {
		
		System.out.println("Navigating back to previous page" );
	}

	public void beforeNavigateForward(WebDriver driver) {
		
		System.out.println("Navigating forward to next page" );
	}

	public void afterNavigateForward(WebDriver driver) {
		
		System.out.println("Navigating forward to next page" );
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		
		System.out.println("Before the Navigation Refresh" );
	}

	public void afterNavigateRefresh(WebDriver driver) {
		
		System.out.println("After the Navigation Refresh" );
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		
		System.out.println("Trying to find Element By: "+ by.toString() );
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		
		System.out.println("Found Element By : "+ by.toString() );
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Trying to click on: "+ element.toString() );
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Clicked on: "+ element.toString() );
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		
		System.out.println("Before change value of: "+ element.toString() +" before any changing mode " );
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	
		System.out.println("Element value changed  to:  "+ element.toString());
	}

	public void beforeScript(String script, WebDriver driver) {
		
		
	}

	public void afterScript(String script, WebDriver driver) {
		
		
	}

	public void onException(Throwable error, WebDriver driver) {
		
		System.out.println("Exception occured: "+ error );
		try {
			TestUtil.takeScreenshotAtEndOfTest1();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

