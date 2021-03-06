package cucu;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;

public class Mno {
	WebDriver driver;
	
	@Given("users open testmeapp")
	public void users_open_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
    	driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
    
		
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		Thread.sleep(3000);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
		Thread.sleep(3000);
	}

	@When("user clicks Login button")
	public void user_clicks_Login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("verify login success")
	public void verify_login_success() {
		
		String text=driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div[2]")).getText();
		 
		Assert.assertTrue(text.contains("Login"));
	    
	}

	@Then("close testmeapp")
	public void close_testmeapp() {
		driver.close();
	}



}
