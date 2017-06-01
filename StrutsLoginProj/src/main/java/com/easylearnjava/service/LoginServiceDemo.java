package com.easylearnjava.service;

import com.easylearnjava.dao.LoginDaoDemo;

public class LoginServiceDemo {

public boolean checkData(String uname, String pswd){
		
		LoginDaoDemo data = new LoginDaoDemo();
		String confirmpassword = data.getPassword(uname);
		
		if(confirmpassword!= null && confirmpassword.equals(pswd))
		{
			return true;
		}
		 return false;
}
}
