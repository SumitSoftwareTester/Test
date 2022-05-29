package HRMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class TC_DragAndDrop {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println("Verify the Titleof an application");
		driver.switchTo().frame(0);
		assertEquals(driver.getTitle(),"Droppable | jQuery UI"); 
		System.out.println("Title Matched");
		Thread.sleep(3000);
		
		System.out.println("Dragand drop function Start");
		//Thread.sleep(4000);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(4000);
		System.out.println("Drag&Drop end");
		
		
		driver.switchTo().defaultContent();

		driver.close();
		
		
	
		
	}


}
