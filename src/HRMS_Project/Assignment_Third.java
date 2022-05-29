package HRMS_Project;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class Assignment_Third {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Links were retrive");
		System.out.println(driver.getCurrentUrl());
		
		 List<WebElement> Links = driver.findElements(By.tagName("a"));
		 for(WebElement allink:Links)
		 {
			 System.out.println(allink.getText());
			 Thread.sleep(4000);
		 }
		 System.out.println("All Links were Printed");
		 driver.close();
	}

}
