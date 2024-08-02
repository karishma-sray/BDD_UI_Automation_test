//package StepDef;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFile.dashBoard_Page;
//import PageFile.login_Page;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class login_StepDef_POM {
//	
//	WebDriver driver;
//	login_Page login ; 
//	dashBoard_Page dashboard;
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("user enters valid {string} and {string}")
//	public void user_enters_valid_and(String uid, String pwd) {
//		login= new login_Page(driver);
//		login.enterCredentials(uid, pwd);
//	}
//
//	@When("^clicks on login button$")
//	public void clicks_on_login_button() {
//		login = new login_Page(driver);
//		login.clickLogin();
//	}
//	
//	@Then("User should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() {
//		
//		dashboard = new dashBoard_Page(driver);
//		dashboard.user_should_be_navigated_to_home_page();
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//}
