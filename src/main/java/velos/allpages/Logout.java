package velos.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {

	@FindBy(xpath = "//div[@class='sc-gzVnrw sc-dnqmqq sc-dqBHgY cTfdRL']")
	WebElement Logoutclick;
	@FindBy (xpath ="//div[@class='sc-gxMtzJ lgessc']")
	WebElement Logout;
	
	public void Logout_exit() {
		
		Logoutclick.click();
		
		
		Logout.click();
		
	}
}
