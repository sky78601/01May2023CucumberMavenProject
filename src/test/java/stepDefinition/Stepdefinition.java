package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;
import pageObject.AdminPage;
import utilities.ReadConfig;

public class Stepdefinition extends Base {
	
	
	@Before
	public void setup() throws Exception {
		
		readConfig= new  ReadConfig();
	System.out.println("Setup method executed");
	//driver=new ChromeDriver();
	
	
	
	String browser=readConfig.getBrowser();
    Thread.sleep(2000) ;
	
	if(browser.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("firefox")) {
	 driver=new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("IE")) {
	 driver=new InternetExplorerDriver();
	}
	
	}
	
	@Given("User Lanch Chrome Browser")
	
	public void user_lanch_chrome_browser() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\QE16_Software\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		ad=new AdminPage(driver);//Create object of admin java class
	   
	}

	
	@When("User open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
		
	   
	}

	@When("user enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		ad.setUsername(email);
		ad.setPassword(password);
		
	  
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		ad.clickOnLogin();
	    
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String string) {
	   
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	    
	}
	
	//Add new customer
	
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	
	}

	@When("user click on customers menu")
	public void user_click_on_customers_menu() {
	    
	}

	@When("user click on customers menu item")
	public void user_click_on_customers_menu_item() {
	   
	}

	@When("user click on new add button")
	public void user_click_on_new_add_button() {
	   
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	   
	}

	@When("user enter customer info as {string} and {string} and \"Bali17")
	

public void user_enter_customer_info_as_and_and_and_and_and_and (String newEmail, String NewPassword, String firstName, String lastName, String gender, String companyName, String adminComment) throws Exception {

addcust.SetEmail(newEmail);
addcust.SetPassword(NewPassword);
addcust.SetFirstName(firstName);
addcust.SetLastName(lastName);
addcust.SetGender(gender);
//addCust.enterDob("6/13/1988");
//addCust.enterManagerOfVendor("Vendor 1");
addcust.SetCompanyName(companyName);
addcust.SetAdminContent(adminComment);
Thread.sleep(2000);

	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		addcust.clickOnSave();
	}

	@Then("user ca n view confirmation msg {string}.")
	public void user_ca_n_view_confirmation_msg(String string) {
	    
	}

	@When("user enter customer info as {string} and {string} and \"Radha")
	public void user_enter_customer_info_as_and_and_radha(String string, String string2) {
	   
	}

	@When("user enter customer info as {string} and {string} and \"Madhu")
	public void user_enter_customer_info_as_and_and_madhu(String string, String string2) {
	   
	}


	
	
	
	@After
	public void tearDown (Scenario sc)  {
	System.out.println("Tear down method executed");
	
	if(sc.isFailed()==true) {
		String fileWithPath="C:\\Users\\Akash\\eclipse-workspace\\01May2023CucumberMavenProject\\screenshot\\failedScreenshot.png";
		
		TakesScreenshot scrshot=((TakesScreenshot)driver);
		
		File scrFile=scrshot.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File (fileWithPath);
		
		try {
			//FileUtils.copyFile(scrFile, destFile);
			Files.copy(scrFile, destFile);
			
			} catch (IOException e)  {

			e. printStackTrace();
			}

		}

	
	driver.quit();
	}
	
}
