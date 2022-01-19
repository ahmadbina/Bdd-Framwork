package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class amazonPageObject extends Base {
	
	
	public amazonPageObject() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement accountList;
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement enterEmail;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement clickContinue;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement enterPassword;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement clickSign;
	
	
	public void clickacountlis() {
		accountList.click();
	}
	public void enteremail() {
		enterEmail.sendKeys("6576001853");
	}
	public void clickcountinue() {
		clickContinue.click();
	}
	public void enterpassword() {
		enterPassword.sendKeys("2315454");
	}
	public void clicksign() {
		clickSign.click();
	}
}
