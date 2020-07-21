package com.his.src.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.his.src.util.ListenerClass;
import com.his.src.util.TestUtil;

public class TestBase {
     
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static ListenerClass eventListener;
	
	public TestBase() {
		try {
			
			prop=new Properties();
			FileInputStream ip=new FileInputStream("./src/com/his/src/config/config.properties");
				prop.load(ip);   
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver"," C:\\SeleniumDriver\\geckodriver.exe");
			driver=new ChromeDriver();
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new ListenerClass();
		e_driver.register(eventListener);	
		driver=e_driver;
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	public static void selectAdvancedButtonOnManinScreen() {
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	}
	public static String getProperty(String key) 
	{
		return prop.getProperty(key);
	}
}

