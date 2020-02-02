package velos.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import velos.allpages.Loginpage;

public class Veloweb_main {
	
	public void Before() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qa.velostics.build-release.com/login");
		
		
		//Loginpage lp = PageFactory.initElements(d, Loginpage.class);
		//lp.Login_web();
		//Tracking_Page tp = PageFactory.initElements(d, Tracking_Page.class);
		//tp.Tracking_Elements();
		//Createshipment cs = PageFactory.initElements(d, Createshipment.class);
		//cs.NewShipments();
		
	}
}
