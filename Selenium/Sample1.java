import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb413\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://www.google.com/");
		d.findElement(By.name("csi"));
		String s=d.getTitle();
		System.out.println(s);
		System.out.println(s.equals("Google"));
		
	}

}
