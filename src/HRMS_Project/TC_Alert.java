package HRMS_Project;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
public class TC_Alert {

	public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert ac=driver.switchTo().alert();
		System.out.println(ac.getText());
		ac.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login part is done");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout part done");

		driver.close();
		

	}

}
