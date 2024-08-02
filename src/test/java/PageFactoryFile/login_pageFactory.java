package PageFactoryFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pageFactory {
	
	WebDriver driver;
	
	@FindBy (id ="user-name")
	WebElement txt_userName;
	
	@FindBy (id ="password")
	WebElement txt_password;
	
	@FindBy (id ="login-button")
	WebElement button_login;
	

	public void enterCredentials(String userName, String password) {
		 try {
			 txt_userName.sendKeys(userName);
			 Thread.sleep(1000);
			 txt_password.sendKeys(password);
			 Thread.sleep(1000);
			 System.out.println("creds entered");
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 }
	
	 public void clickLogin() {
		button_login.click();
	 }
	 //initiate the constructor
		public login_pageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
}