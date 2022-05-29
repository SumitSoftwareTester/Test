package HRMS_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment_Second {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		System.out.println("Start retriving the value from dropdowns");
		
		Select st=new Select(driver.findElement(By.name("loc_code")));
		List <WebElement> dropval=st.getOptions();
		for(WebElement val:dropval)
		{
			System.out.println(val.getText());
		Thread.sleep(3000);	
		}
		System.out.println("DropDown has been retrived");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		
	}

}
