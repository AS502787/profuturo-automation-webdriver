package com.micrositio.pom;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayedAllElementsOfHomePage_Test {

	public WebDriver driver;
	HomePage homepage;

	@Before
	public void setUp() throws Exception {
		
		//homepage = new HomePage(driver);
		//driver = homepage.chromeDriverConnection();
		//driver.manage().window().maximize();
		//homepage.visit("https://micrositio-landig-pages-portal-dev.apps.paasprofuturo-d.r6b1.p1.openshiftapps.com/");
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://accounts.google.com/SignUp?hl=es-419";
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		homepage.isDisplayedAllElementsOfHomePage();
		
	}

}
