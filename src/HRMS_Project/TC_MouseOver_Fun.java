package HRMS_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;



public class TC_MouseOver_Fun {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Title part start");
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("title match");
		}
		else
		{
			System.out.println("Title part not match");
			System.out.println(driver.getTitle());
		}
		
		System.out.println("Login point");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();	
		System.out.println("Login part completed");
		
		if (driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Title match");
		}
		else
		{
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		
		System.out.println("Title part Over");
		
		System.out.println("MouseOver part start");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("MouseOVer part completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		
		System.out.println("Logout part started");
		
		act.moveToElement(driver.findElement(By.id("welcome"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		System.out.println("Logout part done");
		driver.close();
		}
		
	
}
