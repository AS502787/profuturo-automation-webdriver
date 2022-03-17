package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//To open micrositio home page
		driver.get("https://micrositio-landig-pages-portal-dev.apps.paasprofuturo-d.r6b1.p1.openshiftapps.com/");
	}

	@AfterSuite
//Test cleanup
	public void TeardownTest() {
		TestBase.driver.close();
		TestBase.driver.quit();
	}

}
