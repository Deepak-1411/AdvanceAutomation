package com.gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/** To work with the Seleniumgrid configuration is required 
 * 1>Go to the CWD of the selenium server standalone server and create hub using command
 * java -jar selenium-server-standalone-3.141.59.jar -role hub
 * 
 * once the hub is created need to create the node in new CMD by command
 * java -Dwebdriver.chrome.driver="E:\SeleniumLibs\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.104:3333/grid/register
 * copy the URL, that can be used for the automation. 
 * NOTE: Multiple node can be created.
 * Capabilities need to be set to use the GRID on HUB and NODE.
 * */
//hub create 
//node register java -Dwebdriver.chrome.driver="E:\SeleniumLibs\chromedriver.exe" -jar "E:/SeleniumLibs/selenium-server-standalone-3.141.59.jar" -role node -hub http://192.168.0.104:3333/grid/register/
public class ChromeGridTest {
public static final String HUBURL="http://192.168.0.104:3333/wd/hub";
	
	public static void main(String[] args) {
		
		//adding the Desire cap
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
//create the chrome option and MErge
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumLibs\\chromedriver.exe");
		
		//initiate the browse
		WebDriver driver = null;
		//driver= new ChromeDriver();
		try {
			 driver = new RemoteWebDriver(new URL(HUBURL), options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("Completed");
	
		
		driver.quit();
	}
	
	

}
