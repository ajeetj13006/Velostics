package velos.allpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	WebDriver driver;
	
	@FindBy(name="phone")
	WebElement Loginphone;
	
	@FindBy (name  = "password")
	WebElement Loginpassword;
	@FindBy (xpath ="//button[@type='submit']")
	WebElement Loginbutton;
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Loginphone(String phone) {
		Loginphone.sendKeys(phone);
	}
	
	public void Loginpassword(String password) {
		Loginpassword.sendKeys(password);
	}
	
	public void Loginbutton() {
		Loginbutton.click();
	}
	

}
