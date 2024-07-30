package PageFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashBoard_Page {

	WebDriver driver;
	//initialize the constructor
	public dashBoard_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By icon_cart = By.xpath("//span[text()='Name (A to Z)']");
	
	public void user_should_be_navigated_to_home_page() {
		driver.findElement(icon_cart).isDisplayed();
		System.out.println("inside the dashboard");
	}
}
