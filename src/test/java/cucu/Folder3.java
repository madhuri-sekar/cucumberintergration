package cucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.When;

public class Folder3 {

	WebDriver driver;
	

@When("testme displays welcome message")
public void testme_displays_welcome_message() {
}

@When("user performs login operation")
public void user_performs_login_operation() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	
	
}
@When("user enters user name as {string}")
public void user_enters_user_name_as(String string) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	Thread.sleep(3000);
}

@When("When user enters password as {string}")
public void when_user_enters_password_as(String string) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	Thread.sleep(3000);
} 

@When("user searching for product available in cart")
public void user_searching_for_product_available_in_cart() {
	driver.findElement(By.xpath("//*[@id='myInput']")).click();

	Actions act=new Actions(driver);

	   act.sendKeys(Keys.ENTER).click().build().perform();

}

@When("user validating the cart")
public void user_validating_the_cart() {
   
}

@When("user performs payment")
public void user_performs_payment() {
   }

@When("user performs logout")
public void user_performs_logout() {
    
}

}
