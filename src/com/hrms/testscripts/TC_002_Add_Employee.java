package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_002_Add_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		General ob= new General();
		ob.openapplication();
		ob.Login();
		ob.frame_Entered();
		ob.Add_employee();
		ob.frame_out();
		ob.Logout();
		ob.closeapplication();
	}

}
