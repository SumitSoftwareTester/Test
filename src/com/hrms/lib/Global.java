package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//TO provide the test data & object related to whole application 
	
	//Test Data
	public WebDriver driver;
	
	//For Login into application
	public String url= "http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String up="nareshit";
	
	
	//******************Object
	//for logout program
	public String txt_Loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login= "Submit";
	public String link_logout= "Logout";
	
	//For Add Employee Program TC_002
	public String fn =" Krish";
	public String ln="Sumit";
	public String fem_Employeinfo= "rightMenu";
	public String btn_add= "//input[@value='Add']";
	public String fir_name= "txtEmpFirstName";
	public String las_name="txtEmpLastName";
	public String btn_save= "btnEdit";
	
	//For Edit Employee program TC_003
	public String fir= "Junior";
	public String las="NT";
	public String cli_emp="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String btn_edit= "EditMain";
	public String fis_name= "txtEmpFirstName";
	public String las_na="txtEmpLastName";
	public String fi_name= "txtEmpFirstName";
	public String la_name ="txtEmpLastName";
	public String save_btn= "btnEditPers";
	
	
	public String btn_select="loc_code";
	public String search= "loc_name";
	public String search_for= "0366";
	public String btn_search= "//input[@value='Search']";
	public String checkbox= "chkLocID[]";
	public String btn_delete= "//input[@value='Delete']";
	
}
