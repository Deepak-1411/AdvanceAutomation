package testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestBasic {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumLibs\\chromedriver.exe");
	//	DesiredCapabilities cap = new DesiredCapabilities();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
	
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// code to lauch the any dimention of the browser
		// Dimension d = new Dimension(400,400);
		//
		// driver.manage().window().setSize(d);

	}

	@Test
	public void loginHRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		login.click();
		System.out.println("Logged in");
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals("OrangeHRM", title);

	}

	@AfterTest
	public void tearDown(){
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.quit();
		//code to kill the chromdriver from the Task
		try {
			Runtime.getRuntime().exec("taskkill //f //im chromedriver.exe //t");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
