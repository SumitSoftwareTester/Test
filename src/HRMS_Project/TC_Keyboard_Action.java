package HRMS_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

public class TC_Keyboard_Action {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.manage().window().maximize();
//wait the page should be load.
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
System.out.println("Page Loaded");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
//System.out.println("wait the login button should display");
//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
////wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
//driver.findElement(By.name("Submit")).click();

//Keyboard functionality
Robot rc=new Robot();
rc.keyPress(KeyEvent.VK_TAB);
rc.keyPress(KeyEvent.VK_ENTER);           
Thread.sleep(4000);

driver.findElement(By.linkText("Logout")).click();
driver.close();

	}

}
