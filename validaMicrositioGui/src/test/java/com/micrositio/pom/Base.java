package com.micrositio.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElementBy(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public boolean isDisplayed(By locator) {
		try {
			driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public void visit(String url) {
		driver.get(url);	
	}
	
	public void wait(double seconds) {
		
		try {
			Thread.sleep((long) seconds);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
