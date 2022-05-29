package HRMS_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Application_test {

	public static void main(String[] args) throws Exception {
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
		System.out.println("Admin module start");
		driver.findElement(By.className("firstLevelMenu")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_Job")).click();
		System.out.println("Job menu");
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		System.out.println("Logout part started");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		System.out.println("Logout part done");
		driver.close();
		

	}

}
