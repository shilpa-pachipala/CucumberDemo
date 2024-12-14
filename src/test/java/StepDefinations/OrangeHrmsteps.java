package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHrmsteps {
	WebDriver driver;
	
	
	@Given("the user is on the orangeHRM login page")
	public void the_user_is_on_the_orange_hrm_login_page() {
	  
	   
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   
	}

	@When("the user enter login info \\(username:{string} , password:{string})")
	public void the_user_enter_login_info_username_password(String UName, String PSWD) {

    WebElement username=driver.findElement(By.xpath("//input[@name='Username']"));
    username.sendKeys(UName);

   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PSWD);
   

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		WebElement loginbutn=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		   loginbutn.click();
	}


	


}
