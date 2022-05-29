package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_001_Login_Logout  {

public static void main(String[] args) {
// TODO Auto-generated method stub
{
		General ob= new General();
		ob.openapplication();
		ob.Login();
		ob.Logout();
		ob.closeapplication();
	}


}
}
