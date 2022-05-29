package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_003_Edit_Employee {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		General ob= new General();
		ob.openapplication();
		ob.Login();
		ob.frame_Entered();
		ob.cli_empname();
		ob.cl_edit();
		ob.frame_out();
		ob.Logout();
		ob.closeapplication();

	}

}
