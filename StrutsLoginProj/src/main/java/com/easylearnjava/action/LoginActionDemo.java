package com.easylearnjava.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.easylearn.actionform.LoginFormDemo;
import com.easylearnjava.service.LoginServiceDemo;

public class LoginActionDemo extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		System.out.println("inside this method");
		
		ActionMessages message = new ActionMessages();
		
		
		LoginFormDemo loginform = (LoginFormDemo) form;
		System.out.println("username entered from the browser is" + loginform.getUsername());
		
		LoginServiceDemo service = new LoginServiceDemo();
		boolean isvalid = service.checkData(loginform.getUsername(), loginform.getPassword());
		if(isvalid){
			return mapping.findForward("ifSuccess");
		}
		else{
			message.add("username" , new ActionMessage("error.login.required"));
			
			saveErrors(request, message);
			loginform.setPassword("");
			loginform.setUsername("");
			loginform.setConfirmpassword("");
			return mapping.findForward("ifFails");
		}

		
	}

}
