package stepDefinition;

import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.AdminPage;
import utilities.ReadConfig;

public class Base {
//Child Class
	public WebDriver driver;

	public AdminPage ad;
	public AddNewCustomerPage addcust;
	public ReadConfig readConfig;
	
}
