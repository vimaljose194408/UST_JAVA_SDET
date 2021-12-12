package h;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;



public class LoginSteps {
	WebDriver dr;


	@Given("navigate to Gmail page")
	public void navigate_to_Gmail_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb418\\Downloads\\chromedriver.exe");	
	    dr=new ChromeDriver();
	    dr.get("https://mail.google.com/");
	    throw new io.cucumber.java.PendingException();
	   
	}

	@When ("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")
	public void login(String username,String password){
	       dr.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
	       dr.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);
	       dr.findElement(By.xpath("//*[@id='signIn']")).click();
	       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       }
	@Then("^home page should be displayed$")
	public void verifySuccessful(){
	      String expectedText="Gmail";
	      String actualText=         dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();
	      Assert.assertTrue("Login not successful",expectedText.equals(actualText));
	      }

}
