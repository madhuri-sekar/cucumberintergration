package cucu;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Folder1 {
	WebDriver driver;
	@Given("Tester opening testmeapp")
	public void tester_opening_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
    	driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
    
	}

	@When("Tester enter username as {string} And password as {string}")
	public void tester_enter_username_as_And_password_as(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string2);
		Thread.sleep(9000);
		
	}

	@Then("Click ok")
	public void click_ok() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(9000);
	}

	@Then("Verify login page result")
	public void verify_login_page_result() {
		String text=driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div[2]")).getText();
		 
		Assert.assertTrue(text.contains("Login"));
	}



}
