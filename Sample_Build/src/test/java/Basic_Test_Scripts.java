import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pageobjects.Login;

public class Basic_Test_Scripts extends BaseClass {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser); 
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void Sample()
	{
		getDriver().getTitle();
		Login l1 = new Login();
		l1.LoginSteps();
		System.out.println("1234");
		System.out.println("12345");
		System.out.println("123456");
	}

}
