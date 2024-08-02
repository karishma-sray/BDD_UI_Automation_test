package PageFactoryFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_pageFactory {
	
	WebDriver driver;
	
	
	@FindBy (xpath = "//span[text()='Name (A to Z)']")
	WebElement icon_cart;
	
	
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(1000);
		icon_cart.isDisplayed();
		System.out.println("inside the dashboard");
	}
	 //initiate the constructor
		public home_pageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
}