package velos.testcases;

import org.testng.annotations.Test;
import velos.allpages.Createshipment;
import velos.allpages.Loginpage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class NewTest {
	//private WebDriver driver;
	Loginpage login;
	Createshipment newshipment;

  
  @BeforeClass
  public void before(){
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qa.velostics.build-release.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login  = new Loginpage(driver);
		newshipment = new Createshipment(driver);
		
  }
  
  @Test(priority = 1)
  public void login() {
	  login.Loginphone("1111111111");
	  login.Loginpassword("password");
	  login.Loginbutton();
	  }
  
  @Test(priority = 2)
  public void Newshipment() {
	  newshipment.Newshipment();
	  newshipment.shipment_name("automation");
	  newshipment.Po_no("1201_auto0");
	  newshipment.Usertype();
  }

}
