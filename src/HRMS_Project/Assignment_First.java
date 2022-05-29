package HRMS_Project;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.By;

public class Assignment_First {

	public static void main(String[] args )throws Exception {
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
	System.out.println("Click on ALternative checkbox func start");
	for (int i=1;i<=20;i=i+2)
	{
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
		
	Thread.sleep(4000);
	}
	System.out.println("Checkbox part completed");
	
	driver.switchTo().defaultContent();
	System.out.println("Logout Part Start");
	
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Done");
	driver.close();
	
	    }
	
}
