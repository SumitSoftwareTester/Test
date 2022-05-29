package com.hrms.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {
	
	//Standered rule -  To provide all reusable function/methods related to whole application
	
	public void openapplication()
	{
	System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	}
	public void Login()
	{
		driver.findElement(By.name(txt_Loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(up);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login done");
	}
	
	public void frame_Entered()
	{
		System.out.println("Entering into the Frame");
		driver.switchTo().frame(fem_Employeinfo);
		System.out.println("Frame Part done");
	}
	
	public void Add_employee()
	{
		driver.findElement(By.xpath(btn_add)).click();
		System.out.println("Successfully entered into the Add columne");
		System.out.println("Fill the details of Add Employee");
		driver.findElement(By.name(fir_name)).sendKeys(fn);
		driver.findElement(By.name(las_name)).sendKeys(ln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Successfully fill the details");
	}
	
	public void frame_out()
	{
		driver.switchTo().defaultContent();
		System.out.println("Frame closed");
	}
	
 public void cli_empname()
 {
	 System.out.println("Clicking on one employee name from list");
	 driver.findElement(By.xpath(cli_emp)).click();
	 
 }
 public void cl_edit() 
 {
	driver.findElement(By.name(btn_edit)).click();
	System.out.println("Clearing the data from first_name and lastname");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.findElement(By.name(fis_name)).clear();
	driver.findElement(By.name(las_na)).clear();
	System.out.println("entering the data in first name and lastname");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	driver.findElement(By.name(fi_name)).sendKeys(fir);
	driver.findElement(By.name(la_name)).sendKeys(las);
	System.out.println("Saving the data in the first name and lastname");
	
	driver.findElement(By.id(save_btn)).click();
 }
 
 
 
 public void dropdown()
 {
	 System.out.println("Selecting from the dropdown");
	// driver.switchTo().frame("rightMenu");
	 Select st=new Select(driver.findElement(By.id(btn_select)));
	 st.selectByIndex(0);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  System.out.println("Searching the employee");
	 driver.findElement(By.name(search)).sendKeys(search_for);
	 
	 driver.findElement(By.xpath(btn_search)).click();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	 driver.findElement(By.name(checkbox)).click();
	 driver.findElement(By.xpath(btn_delete)).click();
	 System.out.println("Selected employee deleted successfully");
	 //driver.switchTo().defaultContent();
	 
	 
 }
	
	public void Logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout part done");
	}
	public void closeapplication()
	{
		driver.close();
		System.out.println("Application Close");
	}
}
