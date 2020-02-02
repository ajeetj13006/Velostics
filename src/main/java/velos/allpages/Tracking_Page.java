package velos.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tracking_Page {
	
	@FindBy(xpath="//div[@class='sc-gzVnrw sc-htoDjs sc-hZSUBg zoqMA']")
	WebElement Listview;
	@FindBy(xpath="//div[@class='sc-gzVnrw sc-htoDjs sc-hZSUBg zoqMA']")
	WebElement Listviewagain;
	@FindBy (xpath = "//div[@class='sc-gwVKww ewpNCn']")
	WebElement ON_SCHEDULE;
	@FindBy (xpath = "//div[@class='sc-gwVKww kOBHJP']")
	WebElement ON_SCHEDULE1;
	@FindBy (xpath = "//div[@class='sc-gwVKww kDwQyE']")
	WebElement DELAYED;
	@FindBy (xpath = "//div[@class='sc-gwVKww kNVOGn']")
	WebElement DELAYED1;
	@FindBy (xpath = "//div[@class='sc-gwVKww gUhWRo']")
	WebElement APPROACHING;
	@FindBy (xpath = "//div[@class='sc-gwVKww gBmmqv']")
	WebElement APPROACHING1;
	@FindBy (xpath = "//div[@class='sc-gwVKww aYTS']")
	WebElement ARRIVED;
	@FindBy (xpath = "//div[@class='sc-gwVKww lcYkWC']")
	WebElement ARRIVED1;
	@FindBy (name = "searchbar")
	WebElement Searchbar;
	@FindBy (xpath = "//img[@alt='clear search']")
	WebElement Searchbarclear;
	@FindBy (xpath = "//div[@class='sc-gzVnrw sc-htoDjs idRXjX']//div[2]//div[1]")
	WebElement Clickfilter;
	@FindBy (xpath = "//div[contains(text(),'Select Owner')]")
	WebElement Filterfield1;
	@FindBy(xpath = "//div[@class='sc-gzVnrw sc-dnqmqq dnPetH']//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]")
	WebElement Filterfield1value;
	
	
	


}
