package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Login extends BaseClass {
	
	

	@FindBy(xpath = "//input[@name=\"txtUsername\"]")
	private WebElement EmailRMS;
	
	@FindBy(xpath = "//input[@name=\"txtPassword\"]")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@name=\"Submit\"]")
	private WebElement login;
	
	
	public Login()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void LoginSteps()
	{
		EmailRMS.sendKeys("Admin");
		Password.sendKeys("admin123");
		login.click();
	}

}
