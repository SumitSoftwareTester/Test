package HRMS_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
 
public class Drop_Down_Fun {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.manage().window().maximize();
	System.out.println("Login_Part started");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.findElement(By.name("Submit")).click();
	System.out.println("Logout Part Done");
	
	driver.switchTo().frame("rightMenu");
	Thread.sleep(4000);
	System.out.println("Selecting dropdown");
	Select st= new Select(driver.findElement(By.name("loc_code")));
			 Thread.sleep(3000);
	//st.selectByIndex(1);
			 st.selectByValue("0");
			 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("loc_name")).sendKeys("0198");
	System.out.println("Selected dropdown");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.name("chkLocID[]")).click();
	Thread.sleep(3000);
	System.out.println("Selected the checkbox button");
//	driver.findElement(By.xpath("//input[@value='Delete']")).click();
//	System.out.println("Deleted the selected one");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	

	}
}
