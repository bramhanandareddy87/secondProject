package com.rjs.BankOperations;

import java.util.Scanner;

import com.rjs.Dao.DataBase;
import com.rjs.bo.CreateAccountBo;

public class CreateAccount {
	private Scanner input;
	private String name;
	private long accountNo;
	private long phoneNo;
	private CreateAccountBo createAccountBo;
	private DataBase dataBase;
	public void createAcc(){
		createAccountBo=new CreateAccountBo();
		dataBase=new DataBase();
		input=new Scanner(System.in);
		System.out.println("Enter name");
		name=input.next();
		System.out.println("Enter accountNo");
		accountNo=input.nextLong();
		System.out.println("Enter phoneNo");
		phoneNo=input.nextLong();
		createAccountBo.setAccountNo(accountNo);
		createAccountBo.setName(name);
		createAccountBo.setPhoneNo(phoneNo);;
		dataBase.createAccount(createAccountBo);
	}
}
