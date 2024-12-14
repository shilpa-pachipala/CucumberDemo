package StepDefinations;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	
	@Given("the user is on the nopcommerce loginpage")
	public void loginpage() {
	    
	    driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	    		
	    		
	    
	    		
	}

	@When("the user enter valid credentials\\(username:{string},password:{string})")
	public void validcredentials(String user, String pwd) {
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		
		
	    
	}

	@When("the user clicks on login button")
	public void clickloginbutton()
	    {
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		} 

	@Then("the user shoud be redirected to myaccountpage")
	public void myaccountpage() 
	{
		boolean myaccount=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
		Assert.assertEquals(myaccount, true);
	}

	@Then("user should see welcome msg")
	public void Welcomemsg()
	{
		boolean Welcometext=driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
		Assert.assertEquals(Welcometext, true);
		driver.quit();
		
		
	}




}
