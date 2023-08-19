package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewCustomerPage {

	public WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver) {
	ldriver=rdriver;
	Pagefactory.initElements(rdriver,this);
	}

	//WEb Elements

	//@FindBy(xpath = "//input[@id='Email']")
	//WebElement txttEmail;

	//@FindBy (xpath= "//a[@href='#']//p[contains(text(),'Customers')]")
	//WebElement lnkCustomers_menu;

	By lnkCustomers_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");

	By lnkCustomers_menu_item=By.xpath("//p[text()='Customers')]");

	By btnAddnew=By.xpath("//a[@class='btn btn-primary']");

	By txtEmail=By.xpath("//input[@id='Email']");

	By txtPassword=By.xpath("//input[@id='Password']");

	By txtFirstName=By.xpath("("//input[@id='FirstName']");

	By txtLastName=By.xpath("("//input[@id='LastName']");


By rdMaleGender=By.id("("Gender Male");

By rdFemaleGender=By.id("("Gender Female");


By txtDob=By.xpath("//input[@id='DateOfBirth']");


By txtCompanyName=By.xpath("//input[@id='Company']");


By txtAdmitContent=By.xpath("//textarea[@id='AdminComment']");


By btnSave=By.xpath("//button[@name='save']");

//Methods

public String getPageTitle()  {
  return ldriver.getTitle();
}

public void clickOnCustomersMenu(){
ldriver.findElement(lnkCustomes_menu).click();
}


public void clickOnCustomersMenuItem(){
ldriver.findElement(lnkCustomers_menu_item).click();
}
public void clickOnAddnew(){
ldriver.findElement(btmnAddNew).click();
}



public void SetEmail(String email){
ldriver.findElement(txtEmail).sendKeys(email);
}



public void SetPassword(String password){
ldriver.findElement(txtPassword).sendKeys(password);
}

public void SetFirstName(String fname){
ldriver.findElement(txtFirstName).sendKeys(fname);
}
public void SetLastName(String lname){
ldriver.findElement(txtLastName).sendKeys(lname);
}


public void SetGender(String gender){
if(gender.equals("Male")) {
ldriver.findElement(rdMaleGender).click();
}else {
ldriver.findElement(rdFemaleGender).click();
}
}

public void enterDob(String dob)
{
ldriver.findElement(txtDob).sendKeys(dob);
}

public void enterManagerOfVendor(String value)
{
Select drp=new Select (dropdownVendorMgr);
drp.selectByVisibleText(value);
}

public void SetCompanyName(String comName) {
ldriver.dfindElement(txtCompanyName).sendKeys(comName);
}

public void SetAdminContent(String content) {
ldriver.dfindElement(txtAdmitContent).sendKeys(content);
}
public void clickOnSave() {
ldriver.findElement(btnSave).click();
}

}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
