package HRMS_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Wait_Stmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.findElement(By.name("Submit")).click();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("PIM"))));
driver.findElement(By.linkText("PIM")).click();

driver.findElement(By.linkText("Logout")).click();
driver.close();





	}

}
