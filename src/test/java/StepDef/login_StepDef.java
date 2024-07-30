//package StepDef;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class login_StepDef {
//	//WebDriver driver = null;
//	//login_Page lp;
//	static WebDriver driver;
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    driver.get("https://www.saucedemo.com/");
//		//lp.login();
//	}
//
//	@When("user enters valid {string} and {string}")
//	public void user_enters_valid_and(String uid, String pwd) {
//		//lp.enterCredentials();
//		try {
//			driver.findElement(By.id("user-name")).sendKeys(uid);
//			 Thread.sleep(1000);
//			 driver.findElement(By.id("password")).sendKeys(pwd);
//			 Thread.sleep(1000);
//			 System.out.println("creds entered");
//		 }catch(Exception e){
//			 e.printStackTrace();
//		 }
//	}
//
//	@When("^clicks on login button$")
//	public void clicks_on_login_button() {
//		driver.findElement(By.id("login-button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		//lp.clickLogin();
//	}
//
//	@Then("User should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() {
//		try {
//			int count = 0;
//			Thread.sleep(1000);
//			if(driver.findElements(By.xpath("//span[text()='Name (A to Z)']")) != null) {
//				count++;
//			}
//			System.out.println("count is : "+count);
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	}
//
//	@Then("close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//}
