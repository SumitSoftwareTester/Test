package HRMS_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_001_Login_function {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Login point");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();	
	System.out.println("Login part completed");
	Thread.sleep(3000);
	System.out.println("Logout part started");
	Thread.sleep(3000);
	driver.findElement(By.id("welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
	//driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
	System.out.println("Logout part done");
	driver.close();
	}

}
