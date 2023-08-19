package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver ldriver;

		//WebDriver driver= new ChromeDriver();

		//WebElement textEmail=driver.findElement(By.xpath("//input[@id='Email']"));
		
	public AdminPage (WebDriver rdriver) {
		  ldriver=rdriver;
		PageFactory.initElements(rdriver,this);

		}
	
		@FindBy(xpath="//input[@id='Email']")
		WebElement txtEmail;


		@FindBy(xpath="//input[@id='Password']")
		WebElement txtPassword;

		@FindBy(xpath="//button[text()='Log in']")
		WebElement btnLogin;

		public void setUsername(String uname) {
			txtEmail.sendKeys(uname);
			}

			public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);
			}

			public void clickOnLogin() {
			btnLogin.click();
			}
		

	

}
