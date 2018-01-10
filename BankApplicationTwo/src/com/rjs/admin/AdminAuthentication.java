package com.rjs.admin;

import com.rjs.BankOptions.BankOperations;
import com.rjs.bo.AdminBo;

public class AdminAuthentication {

	String name;
	String password;
	BankOperations bankOperations;
	public void adminAuth(AdminBo adminBo){
		name=adminBo.getName();
		password=adminBo.getPassword();
		if("admin".equals(name)&&"admin123".equals(password)){
			bankOperations=new BankOperations();
			bankOperations.bankOption();
			
			
		}
	}
}
