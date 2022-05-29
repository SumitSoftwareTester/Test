package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_004_Delete_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		General ob= new General();
		ob.openapplication();
		ob.Login();
		ob.frame_Entered();
		ob.dropdown();
		ob.frame_out();
		ob.Logout();
		ob.closeapplication();

	}

}
