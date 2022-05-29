package HRMS_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_File_Upload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub]
		
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Rajkumar");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Sumit ");
		Thread.sleep(3000);
		System.out.println("Upload the photo part start");
		WebElement fileinput = driver.findElement(By.name("photofile"));	
		fileinput.sendKeys("R:\\ayansh.jpg");
		Thread.sleep(3000);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("file is uploaded successfully.");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
