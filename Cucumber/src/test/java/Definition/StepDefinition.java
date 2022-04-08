package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class StepDefinition {
	private static final CharSequence string = null;
	WebDriver driver;
	public String URL="https://demoapp.skillrary.com/login.php?type=login";
	
	@Given("i should open the browser and naviagte to the login page of skillrary")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		driver.findElement(By.linkText("LOGIN")).click();
		
	}
	@When("Enter Username {string}")
	public void enter_username(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
	  
	}
	@When("Enter Password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	 
	}
	@When("Click on the loginbutton")
	public void click_on_the_loginbutton() {
		driver.findElement(By.id("last")).click();
	  
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		Assert.assertEquals(username, name);	 
	}
//	@Then("i should see the admin as {string}")
//	public void i_should_see_the_admin_as(String string) {
//	  // Write code here that turns the phrase above into concrete actions
//		WebElement admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p"));
//		Assert.assertEquals(admin.getText(), string);
//		driver.close();
//	}
	@Then("i should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String name) {
		WebElement we = driver.findElement(By.id("registerClick"));
		   Assert.assertEquals(we.getText(), name);
	   driver.close();
	}

}

























