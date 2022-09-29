package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.en.*;

public class AmazonLoginSteps
{
	public WebDriver driver;

	@Given("User is on Home page")
	public void user_is_on_home_page() throws InterruptedException {
	    //System.setProperty("webdriver.chrome.driver", "/Users/Neelam/eclipse-workspace/AccountsCucumber/chromedriver");
	    //ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new SafariDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
		
		//System.out.println("on homepage");
	}
	@When("User navigate to Login page")
	public void user_navigate_to_login_page() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
		actions.moveToElement(mainMenu).perform();
		//actions.moveToElement(subMenu).click().perform();
		subMenu.click();
		
		
		
		
		
		 //driver.findElement(By.id("nav-link-accountList")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\\\"nav-signin-tooltip\\\"]/a")).click();
		
		//System.out.println("on login page");
	}

	@And("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
	    driver.findElement(By.id("ap_email")).sendKeys("abcd@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("abcd");
		
		//System.out.println("Entered username and password");
	}

	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() {
		driver.findElement(By.id("signInSubmit")).click();
		
		//System.out.println("Login Successfully");
	}

	@When("User logout from application")
	public void user_logout_from_application() throws InterruptedException {
		Actions action = new Actions(driver);
		//Thread.sleep(5000);
		WebElement act = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement sout = driver.findElement(By.id("nav-item-signout"));
		action.moveToElement(act).perform();
		//Thread.sleep(1000);
		action.moveToElement(sout).click().perform();
		
		//System.out.println("Logging out");
	}

	@Then("Message displayed logout successfully")
	public void message_displayed_logout_successfully() {
	   driver.close();
	   System.out.println("Logout Successfully");
	}
}
