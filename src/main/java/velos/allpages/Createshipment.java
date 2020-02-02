package velos.allpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createshipment {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='sc-btzYZH groNko']//div[4]//a[1]")
	WebElement Newshipment;
	@FindBy (name ="shipment_name")
	WebElement shipment_name;
	@FindBy (name= "po_no")
	WebElement Po_no;
	@FindBy(xpath = "//body/div[@id='root']/div[@class='sc-ifAKCX bKagbx']/div[@class='sc-exAgwC felTYg']/div[@class='sc-hrWEMg dFHMPv']/div[@class='sc-bXGyLb bLxEaZ']/div[@class='sc-bxivhb hJIILc sc-bZQynM sc-iBEsjs NdSkI']/form/div[@class='ant-row-flex ant-row-flex-center']/div[@class='ant-col ant-col-md-10']/div[@class='ant-card ant-card-bordered']/div[@class='ant-card-body']/div[@class='sc-gzVnrw kVVUyS']/div[@class='sc-emmjRN cZqPab ant-select ant-select-enabled']/div[1]")
	WebElement Usertype;
	@FindBy (xpath = "//li[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active']")
	WebElement SelectUsertype;
	@FindBy (xpath = "//button[@class='sc-jzJRlG eNwrfP primary-btn round-btn']")
	WebElement Createshipment;
	
	
	
	public Createshipment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Newshipment() {
		Newshipment.click();
	}
	
	public void shipment_name(String Shipmentname) {
		shipment_name.sendKeys(Shipmentname);
	}
	
	public void Po_no(String po_no) {
		Po_no.sendKeys(po_no);
	}
	
	public void Usertype() {
		Usertype.click();
		SelectUsertype.click();
		Createshipment.click();
	}

}
