package validaMicrositioGui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeSessions {
	
	  public static WebDriver driver;
	  
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  //WebDriverManager.chromedriver().setup();
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();
	  ChromeOptions options = new ChromeOptions();
	  driver = new ChromeDriver(options);
	  //driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  String url="https://accounts.google.com/SignUp?hl=es-419";
      driver.get(url);
	  
	  driver.quit();
	  
	  }	
}
