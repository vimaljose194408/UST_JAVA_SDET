package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver =null;

	
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb418\\Downloads\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	    

	@When("the user navigates to urban ladder")
	public void the_user_navigates_to_urban_ladder() {
		driver.get("https://www.urbanladder.com/");
	}

	@Then("click Dining")
	public void search_Dining() throws InterruptedException {
	driver.findElement(By.xpath("//span[@class='topnav_itemname'")).click();
		 System.out.println("Clicking on Dining Table");
	        driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/span")).click();
	        Thread.sleep(3000);
	        driver.navigate().to("https://www.urbanladder.com/dining-tables?src=g_topnav_dining_dining-tables-sets_dining-tables");
	        Thread.sleep(3000);
	        System.out.println("Close Pop-Up");
	        driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]")).click();
	        System.out.println("Checkboxing now");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"price_limit_4535-49323\"]")).click();
	        Thread.sleep(2000);
	        System.out.println("Clicking RadioButton");
	        driver.findElement(By.xpath("//*[@id=\"price_limit_4535-49323\"]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
	        Thread.sleep(2000);
	        System.out.println("Clearing Filter");
	        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[2]/div/div/ul/li[1]/div/div[1]/span[2]")).click();
	        Thread.sleep(2000);
	        System.out.println("Clicking on Table");
	        driver.navigate().to("https://www.urbanladder.com/products/arabia-6-seater-dining-table?sku=FNTBDI11TK10001&src=room");
	        Thread.sleep(2000);
	        
	        System.out.println("Clicking on Help");
	        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"4192\"]/div[2]/div")).click();
	        System.out.println("Clicking on track order");
	        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[2]/a")).click();
	       
	        System.out.println("Passing Values to Accessing orders");
	       
	        driver.findElement(By.id("ip_379403698")).sendKeys("Grp4");
	        Thread.sleep(2000);
	        driver.findElement(By.id("ip_394711104")).sendKeys("9727283221");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button/span[1]")).click();
	        Thread.sleep(3000);
	        System.out.println("Window Closed");
	        driver.close();
	        
	}
	

	
	
		
}



