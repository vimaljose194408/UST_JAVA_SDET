package TestNGpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestClass {



	WebDriver d;
	@BeforeTest
	public void checkWebsite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb418\\Downloads\\chromedriver.exe");
		d=new ChromeDriver();
		d.navigate().to("https://www.google.co.in/");
	}
  @Test
  public void f() {
	  d.findElement(By.name("q")).sendKeys("ERNAKULAM");
	  
	  //d.findElement(By.name("btnI")).submit();
  }
 
}



