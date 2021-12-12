package gp4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group4_Selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb418\\Downloads\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.urbanladder.com/";
        driver.get(baseUrl);
        
		String s = driver.getTitle();
		System.out.println(s);
		s.equals(" Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
        
        driver.findElement(By.id("search")).getTagName();
        driver.manage().window().maximize();

      
        System.out.println("Clicking on Dinning Table");
        driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/span")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://www.urbanladder.com/dining-tables?src=g_topnav_dining_dining-tables-sets_dining-tables");
        Thread.sleep(3000);
        System.out.println("Close pop up");
        driver.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]")).click();
        System.out.println("Checkboxing now");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"price_limit_4535-49323\"]")).click();
        Thread.sleep(2000);
        System.out.println("Clicing radio button");
        driver.findElement(By.xpath("//*[@id=\"price_limit_4535-49323\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[1]")).click();
        Thread.sleep(2000);
        System.out.println("Clearing filter");
        driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li/div[2]/div/div/ul/li[1]/div/div[1]/span[2]")).click();
        Thread.sleep(2000);
        System.out.println("click on table");
        driver.navigate().to("https://www.urbanladder.com/products/arabia-6-seater-dining-table?sku=FNTBDI11TK10001&src=room");
        Thread.sleep(2000);
        
        System.out.println("Click on Help");
        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"4192\"]/div[2]/div")).click();
        System.out.println("Clicking on track order");
        driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[2]/a")).click();
       
        System.out.println("Passing values to access orders");
       
        driver.findElement(By.id("ip_379403698")).sendKeys("Grp4");
        Thread.sleep(2000);
        driver.findElement(By.id("ip_394711104")).sendKeys("9727283221");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button/span[1]")).click();
        Thread.sleep(3000);
        System.out.println("Window closed");
        driver.close();
        
}
}
