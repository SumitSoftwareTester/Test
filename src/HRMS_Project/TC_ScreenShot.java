package HRMS_Project;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
try {

	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.name("Submit")).click();

	Thread.sleep(3000);
	
    WebElement element = driver.findElement(By.linkText("PIM"));
    Actions action = new Actions(driver);
   action.moveToElement(element).perform();
   Thread.sleep(3000L);
driver.findElement(By.linkText("Add Employee")).click();
   Thread.sleep(4000);
   System.out.println("Clicked on submenu");        
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
catch(Exception e)
{
	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("R:\\\\Software Testing Video Class\\\\Testresult.png"));
	//FileUtils.copyFile(f1, newfile(""));
}
}
}