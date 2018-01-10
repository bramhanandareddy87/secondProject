package com.rjs.admin;

import java.util.Scanner;

import com.rjs.bo.AdminBo;

public class HomePage {
static String userName;
static String passWord;
static AdminBo adminBo;
static AdminAuthentication adminAuthentication;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the Username");
userName=input.next();
System.out.println("Enter the Password");
passWord=input.next();
adminBo=new AdminBo();
adminBo.setName(userName);
adminBo.setPassword(passWord);
adminAuthentication=new AdminAuthentication();
adminAuthentication.adminAuth(adminBo);
	}

}
