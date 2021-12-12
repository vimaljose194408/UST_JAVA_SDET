import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.ous.jtoml.ParseException;

public class SeleniumExample11 {
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
 	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb413\\Downloads\\chromedriver.exe");
		   wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}
