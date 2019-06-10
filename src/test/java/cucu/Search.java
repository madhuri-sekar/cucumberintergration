package cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Search {

WebDriver driver;

@Given("open testmeapplication")

public void open_testmeapp() {

System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

driver=new ChromeDriver();

driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}
@When("user enter {string}")

public void user_enters(String string) throws InterruptedException {

	driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
	Thread.sleep(9000);
	

}
@When("user click enter")

public void user_clicks_enter() throws InterruptedException {

	
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	Thread.sleep(9000);
   //Actions act=new Actions(driver);
  // act.sendKeys(Keys.ENTER).click().build().perform();

}


}

