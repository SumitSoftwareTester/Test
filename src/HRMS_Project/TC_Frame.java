package HRMS_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC_Frame {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Mover over Started");
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
//ac.moveToElement(driver.findElement(By.id("menu_pim_addEmployee"))).click();
System.out.println("Mousemover is completed");
Thread.sleep(3000);
System.out.println("Click oin add new employee menu ");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
System.out.println("entering new employee name");
Thread.sleep(3000);
System.out.println("Frame concept start");
driver.switchTo().frame("rightMenu");
Thread.sleep(3000);
driver.findElement(By.id("txtEmpLastName")).sendKeys("Sharma");
Thread.sleep(3000);
driver.findElement(By.id("txtEmpFirstName")).sendKeys("Raj");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.id("btnEdit")).click();
System.out.println("saved the new employee");
System.out.println("Logout started");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout done");
driver.close();
		}
	
		
		}
	
	


