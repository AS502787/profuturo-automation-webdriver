package Automation.Test.Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import junit.framework.Assert;
import Automation.Test.SeleniunmConfig.LeerDataTable;
import Automation.Test.ApplicationObjects.CreateAccountObj;

public class CreateAccount implements CreateAccountObj{
	

    	
	public void pause(Integer milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public WebDriver driver;
	
	@Before
	public void openNavigator() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://accounts.google.com/SignUp?hl=es-419";
		driver.get(url);
	}

	@Test
	public void createAccount()  {
				
		pause(5000);
		driver.findElement(By.xpath(TXT_NOMBRE)).sendKeys("Antonio");
		pause(1000);
		driver.findElement(By.xpath(TXT_APELLIDO)).sendKeys("Solano");
		pause(1000);
		driver.findElement(By.xpath(TXT_CORREO)).sendKeys("mitest256@gmail.com");
		pause(1000);
		driver.findElement(By.xpath(TXT_PASSWORD)).sendKeys("Mcqueen01");
		pause(1000);
		driver.findElement(By.xpath(TXT_PASSWORDCONF)).sendKeys("Mcqueen01");
		pause(1000);
		driver.findElement(By.xpath(TXT_DIA)).sendKeys("03");
		pause(1000);
		driver.findElement(By.xpath(TXT_MES)).click();
		pause(1000);
		driver.findElement(By.xpath(TXT_MES)).sendKeys("julio"+Keys.ENTER);
		pause(1000);
		driver.findElement(By.xpath(TXT_ANIO)).sendKeys("1994");
		pause(1000);
		driver.findElement(By.xpath(TXT_GENERO)).click();
		pause(1000);
		driver.findElement(By.xpath(TXT_GENERO)).sendKeys("hombre"+Keys.ENTER);
		pause(1000);
		driver.findElement(By.xpath(TXT_CELULAR)).sendKeys("5515786001");
		pause(1000);
		driver.findElement(By.xpath(TXT_CORREOALT)).sendKeys("anthony13solanoo@gmail.com");	
		pause(1000);
		
		
	}
	
	@After
	public void endTest() {
		driver.close();
		driver.quit();
	}

}
