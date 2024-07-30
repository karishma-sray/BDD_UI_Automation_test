package PageFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_Page {
	WebDriver driver;
	//Initialize the constructor
	public login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By txt_userName = By.id("user-name");	
	By txt_password = By.id("password");
	By button_login = By.id("login-button");
	
	
	
	
	public void enterCredentials(String userName, String password) {
		 try {
			 driver.findElement(txt_userName).sendKeys(userName);
			 Thread.sleep(1000);
			 driver.findElement(txt_password).sendKeys(password);
			 Thread.sleep(1000);
			 System.out.println("creds entered");
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 }
	 public void clickLogin() {
		 driver.findElement(button_login).click();
	 }
}

