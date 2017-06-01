package com.easylearn.actionform;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginFormDemo extends ActionForm {
	private String username;
	private String password;
    private String sex; 
    private String confirmpassword;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errormessage = new ActionErrors();
		if (!(username != null && username.length() >= 5)) {
			errormessage.add("username", new ActionMessage("error.username.required"));
		}
		if (!(password != null && password.length() >= 5)) {
			errormessage.add("password", new ActionMessage("error.password.required"));

		}
		if((confirmpassword!=null && !confirmpassword.equals(password))){
			errormessage.add("confirmpassword", new ActionMessage("error.confirmpassword.required"));
		}
		
		/*if(sex !=null && sex.isEmpty()){
			errormessage.add("sex" , new ActionMessage("error.sex.required"));
		}*/
		return errormessage;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
