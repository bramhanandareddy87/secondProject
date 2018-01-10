package com.rjs.BankOptions;

import java.util.Scanner;

import com.rjs.BankOperations.CreateAccount;
import com.rjs.BankOperations.CreditOperation;
import com.rjs.BankOperations.Debitoperation;
import com.rjs.BankOperations.TransferOperation;

public class BankOperations {
	int option;
	Scanner input;
	CreateAccount createAccount;
	CreditOperation credit;
	Debitoperation debit;
	TransferOperation transfer;
public void bankOption(){
	input=new Scanner(System.in);
	System.out.println("Enter 1 for Create User Account, 2 for Debit, 3 forWE Credit, 4 for Transfer");
	option=input.nextInt();
	if(option==1){
		createAccount=new CreateAccount();
		createAccount.createAcc();
	}
	else if(option==2){
		debit=new Debitoperation();
		debit.debit();
	}
	else if(option==3){
		credit=new CreditOperation();
	}
	else if(option==4){
		transfer=new TransferOperation();
	}
}
}
